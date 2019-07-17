package jnshu.tiles.utils;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import jnshu.tiles.entity.SendM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Demo {

    @Autowired
    private SendM sendM;
    public String mobile(Long phoneNumbers, String templateParam){
//        System.out.println(sendM);
//        ApplicationContext ac =new ClassPathXmlApplicationContext("classpath:/spring/spring-mybatis.xml");
//        SendM sendM = (SendM) ac.getBean("sendM");
        DefaultProfile profile = DefaultProfile.getProfile("default", sendM.getAccessKeyId(), sendM.getSecret());
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("PhoneNumbers", String.valueOf(phoneNumbers));
        request.putQueryParameter("SignName", sendM.getSingName());
        request.putQueryParameter("TemplateCode", sendM.getTemplateCode());
        request.putQueryParameter("TemplateParam", "{\"code\":"+templateParam+"}");
        try {
            CommonResponse response = client.getCommonResponse(request);
            return response.getData();
            //System.out.println(response.getData());
        } catch (ServerException e) {
            e.printStackTrace();
            return e.toString();
        } catch (ClientException e) {
            e.printStackTrace();
            return e.toString();
        }
    }

   /* @Test*/
    public  void checkcode(){
        DefaultProfile profile = DefaultProfile.getProfile("default", "LTAIpS7EpfvXhAV3", "1DOc9hAsvCRk2Uo9JLYjZlyC8uVYjk");
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("QuerySendDetails");
        request.putQueryParameter("PhoneNumber", "18796006044");
        request.putQueryParameter("SendDate", "20190709");
        request.putQueryParameter("PageSize", "50");
        request.putQueryParameter("CurrentPage", "1");
        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
            response.getData();
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }

}
