package jnshu.tiles.utils;

import com.aliyun.oss.ClientException;
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.OSSException;
import com.aliyun.oss.model.GetObjectRequest;
import com.aliyun.oss.model.ObjectMetadata;
import jnshu.tiles.entity.SendM;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.UUID;

@Component
public class FileuploadUtil {

    @Autowired
    private SendM sendM;

    private Logger logger = LogManager.getLogger(getClass().getName());
   /* private static Logger logger = LogManager.getLogger(FileuploadUtil.class);
*/
    // endpoint是访问OSS的域名。如果您已经在OSS的控制台上 创建了Bucket，请在控制台上查看域名。
    // 如果您还没有创建Bucket，endpoint选择请参看文档中心的“开发人员指南 > 基本概念 > 访问域名”，
    // 链接地址是：https://help.aliyun.com/document_detail/oss/user_guide/oss_concept/endpoint.html?spm=5176.docoss/user_guide/endpoint_region
    // endpoint的格式形如“http://oss-cn-hangzhou.aliyuncs.com/”，注意http://后不带bucket名称，
    // 比如“http://bucket-name.oss-cn-hangzhou.aliyuncs.com”，是错误的endpoint，请去掉其中的“bucket-name”。
   // private static String endpoint = "http://oss-cn-shanghai.aliyuncs.com";

    // accessKeyId和accessKeySecret是OSS的访问密钥，您可以在控制台上创建和查看，
    // 创建和查看访问密钥的链接地址是：https://ak-console.aliyun.com/#/。
    // 注意：accessKeyId和accessKeySecret前后都没有空格，从控制台复制时请检查并去除多余的空格。
    //private static String accessKeyId = "LTAIpS7EpfvXhAV3";
    //private static String accessKeySecret = "1DOc9hAsvCRk2Uo9JLYjZlyC8uVYjk";

    // Bucket用来管理所存储Object的存储空间，详细描述请参看“开发人员指南 > 基本概念 > OSS基本概念介绍”。
    // Bucket命名规范如下：只能包括小写字母，数字和短横线（-），必须以小写字母或者数字开头，长度必须在3-63字节之间。
    //private static String bucketName = "kxptest";

    // Object是OSS存储数据的基本单元，称为OSS的对象，也被称为OSS的文件。详细描述请参看“开发人员指南 > 基本概念 > OSS基本概念介绍”。
    // Object命名规范如下：使用UTF-8编码，长度必须在1-1023字节之间，不能以“/”或者“\”字符开头。
    //private static String firstKey = "test";



    public String fileupload(MultipartFile file) {

        OSS ossClient = new OSSClientBuilder().build(sendM.getEndpoint(),sendM.getAccessKeyId(), sendM.getSecret());
        String newname= UUID.randomUUID().toString();
        String localfilepath = file.getOriginalFilename();
        logger.info(newname);
        String suffix = localfilepath.substring(localfilepath.lastIndexOf(".") + 1);
        newname=newname+"."+suffix;
        logger.info(newname);

        /*//设置防盗链： https://help.aliyun.com/document_detail/32021.html?spm=a2c4g.11186623.6.862.1c9c6d1cskVgLv
        //其他配置见以上链接
        List<String> refererList = new ArrayList<String>();
        // 添加Referer白名单。Referer参数支持通配符星号（*）和问号（？）。
        refererList.add("http://www.aliyun.com");
        refererList.add("http://www.*.com");
        refererList.add("http://www.?.aliyuncs.com");
        // 设置存储空间Referer列表。设为true表示Referer字段允许为空。
        BucketReferer br = new BucketReferer(true, refererList);
        ossClient.setBucketReferer(sendM.getBucketName(), br);*/
        try {
            if (ossClient.doesBucketExist(sendM.getBucketName())) {
                System.out.println("您已经创建Bucket：" + sendM.getBucketName() + "。");
            } else {
                System.out.println("您的Bucket不存在，创建Bucket：" + sendM.getBucketName() + "。");
                // 创建Bucket。详细请参看“SDK手册 > Java-SDK > 管理Bucket”。
                // 链接地址是：https://help.aliyun.com/document_detail/oss/sdk/java-sdk/manage_bucket.html?spm=5176.docoss/sdk/java-sdk/init
                ossClient.createBucket(sendM.getBucketName());
            }
            //各种方法请到：https://help.aliyun.com/document_detail/84781.html?spm=a2c4g.11186623.2.18.6fdc6f09wfbndK#concept-84781-zh
            //以上网站查看
            ossClient.putObject(sendM.getBucketName(), newname, new ByteArrayInputStream(file.getBytes()));

        } catch (OSSException oe) {
            oe.printStackTrace();
            return oe.getMessage();
        } catch (ClientException ce) {
            ce.printStackTrace();
            return ce.getMessage();
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        } finally {
            ossClient.shutdown();
        }
        return "https://kxptest.oss-cn-shanghai.aliyuncs.com/"+newname;
    }

    public String downLoadFile(String filename ,HttpServletRequest request ){
        // 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(sendM.getEndpoint(), sendM.getAccessKeyId(), sendM.getSecret());
        String newpath=request.getSession().getServletContext().getRealPath("/")+filename;
        try {
            // 下载OSS文件到本地文件。如果指定的本地文件存在会覆盖，不存在则新建。
            ObjectMetadata object = ossClient.getObject(new GetObjectRequest(sendM.getBucketName(), filename), new File(newpath));
            System.out.println("++++++++++++++++++++++"+object);
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }finally {
            ossClient.shutdown();
        }
        // 关闭OSSClient。
        return newpath;
    }
}
