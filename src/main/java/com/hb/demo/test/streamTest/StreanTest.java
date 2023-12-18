package com.hb.demo.test.streamTest;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreanTest {
    public static void main(String[] args) throws Exception{
        //列表创建流，filter过滤方法，map映射方法，修改原值
        // List<String> fruits = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
        // fruits.stream().filter(e->e.length()>5)
        //         .map(String ::toUpperCase)
        //         .forEach(System.out :: println);
        // System.out.println("-----------------------------------------------------------------------");
        // //数组创建流,filter方法过滤，mp方法映射每个元素为新的元素
        // int [] nums = {1,2,3,4,5};
        // IntStream stream = Arrays.stream(nums);
        // stream.filter(e->e%2 == 0)
        //         .map(e->e*e)
        //         .forEach(System.out :: println);
        //
        // System.out.println("-----------------------------------------------------------------------");

        // Stream.Builder<Object> builder = Stream.builder();
        // builder.add("apple")
        //         .add("banana")
        //         .add("orange");
        // Stream<Object> build = builder.build();
        // build.forEach(System.out :: println);
        //
        // System.out.println("-----------------------------------------------------------------------");

        String path = "C:\\Users\\ben.huang\\Desktop\\链接.txt";
        List<String> http = new ArrayList();
        try {
            Stream<String> lines = Files.lines(Paths.get(path));
             http = lines.filter(e -> e.contains("http"))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new Exception("读取文件出错"+e.getMessage());
        }

        System.out.println("-----------------------------------------------------------------------");

        String url = "https://cloud-test.clinflash.com/api/users/login";
        URL url1 = new URL(url);
        HttpURLConnection urlConnection = (HttpURLConnection) url1.openConnection();
        urlConnection.setRequestMethod("POST");
        urlConnection.setRequestProperty("Content-Type","application/json");
        String requestBody = "{\n" +
                "  \"username\": \"ben.huang@clinflash.com\",\n" +
                "  \"password\": \"BBB.1452\"\n" +
                "}";
        urlConnection.setDoOutput(true);
        urlConnection.getOutputStream().write(requestBody.getBytes("utf-8"));

        int responseCode = urlConnection.getResponseCode();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        String inputLine;
        //获取请求结果
        StringBuffer stringBuffer = new StringBuffer();
        while((inputLine = bufferedReader.readLine())!=null){
            stringBuffer.append(inputLine);
        }
        String s = http.get(3);
        System.out.println(s);
        bufferedReader.close();

        System.out.println("response code : "+ responseCode);
        System.out.println("response body : "+ stringBuffer.toString());
        String result = stringBuffer.toString();
        JsonObject jsonObject = new Gson().fromJson(result, JsonObject.class);
        JsonElement jsonElement = jsonObject.getAsJsonObject("data").get("token");
        String token = "";
        if(jsonElement!=null){
            token = jsonElement.getAsString();
        }
        String usefulConn = s+token;
        System.out.println(usefulConn);
    }
}
