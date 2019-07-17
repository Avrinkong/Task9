package jnshu.tiles.utils;


import jnshu.tiles.entity.SendCloud;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/*@RunWith(SpringJUnit4ClassRunner.class)
  *//*加载配置文件*//*
@ContextConfiguration(locations={"classpath:spring/spring-mybatis.xml"})*/
@Component
public class SendCommonPostMail {

    @Autowired
    SendCloud sendCloud;

    @Test
    public String send_common(String rcptTo,String templateParam) throws IOException {
//        SendCloud sendCloud = (SendCloud) ac.getBean("sendCloud");
        String s="";
        final String url = "http://api.sendcloud.net/apiv2/mail/send";

        final String apiUser = sendCloud.getApiUser() ;
        final String apiKey = sendCloud.getApiKey();
        final String rcpt_to = sendCloud.getRcpt_to();

        String subject = sendCloud.getSubject();
        String html = sendCloud.getHtml();

        HttpPost httpPost = new HttpPost(url);
        CloseableHttpClient httpClient = HttpClients.createDefault();

        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("apiUser", apiUser));
        params.add(new BasicNameValuePair("apiKey", apiKey));
        params.add(new BasicNameValuePair("to", rcptTo));
        params.add(new BasicNameValuePair("from", "sendcloud@sendcloud.org"));
        params.add(new BasicNameValuePair("fromName", "SendCloud"));
        params.add(new BasicNameValuePair("subject", subject));
        params.add(new BasicNameValuePair("html", templateParam));

        httpPost.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));

        HttpResponse response = httpClient.execute(httpPost);

        // 处理响应
        try {
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                s = EntityUtils.toString(response.getEntity());
                // 正常返回, 解析返回数据
                System.out.println(s);
            } else {
                s = "error";
            }
            return s;
        }finally {
            httpPost.releaseConnection();
        }



    }
}

