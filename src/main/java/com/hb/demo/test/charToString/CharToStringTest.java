package com.hb.demo.test.charToString;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.LocalDate;

@Slf4j
public class CharToStringTest {
    public static void main(String[] args) throws MalformedURLException {
        LocalDate.now();
        char a = 'a';
        String s = String.valueOf(a);
        System.out.println("---------------String.valueof方法-------------------");
        System.out.println(s);
        String s1 = Character.toString(a);
        System.out.println("---------------Character.toString方法-------------------");
        System.out.println(s1);
        URL url = new URL("http://www.baidu.com");
        System.out.println("protocol:"+url.getProtocol()+System.lineSeparator()+"HostName:"+url.getHost()+System.lineSeparator()+"Port Number:"+url.getPort()+System.lineSeparator());
        System.out.println("------------------------------------------------------");
        try {
            URLConnection urlConnection = url.openConnection();
            InputStream inputStream = urlConnection.getInputStream();
            int i;
            while((i = inputStream.read())!=-1){
                System.out.print((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
            log.error("url打开出错");
        }
    }
}
