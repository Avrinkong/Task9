package jnshu.tiles.utils;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class VcodeUtil {
    public String createVcode(){
        String sources = "0123456789"; // 加上一些字母，就可以生成pc站的验证码了
        Random rand = new Random();
        StringBuffer flag = new StringBuffer();
        for (int j = 0; j < 6; j++)
        {
            flag.append(sources.charAt(rand.nextInt(9)) + "");
        }
        String templateParam=flag.toString();
        System.out.println(flag.toString());
        return templateParam;
    }
}
