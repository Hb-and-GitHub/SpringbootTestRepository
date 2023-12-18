package com.hb.demo.test.link;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ecoaDevLink {
    public static void main(String[] args) throws Exception {

        String path = "C:\\Users\\ben.huang\\Desktop\\链接.txt";
        List<String> http = new ArrayList();
        try {
            Stream<String> lines = Files.lines(Paths.get(path));
            http = lines.filter(e -> e.contains("http"))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new Exception("读取文件出错" + e.getMessage());
        }

        System.out.println("-----------------------------文件读取成功------------------------------------------");

        String url = "https://cloud-test.clinflash.com/api/users/login";
        URL url1 = new URL(url);
        HttpURLConnection urlConnection = (HttpURLConnection) url1.openConnection();
        urlConnection.setRequestMethod("POST");
        urlConnection.setRequestProperty("Content-Type", "application/json");
        String requestBody = "{\n" +
                "  \"username\": \"ben.huang@clinflash.com\",\n" +
                "  \"password\": \"BBB.1452\"\n" +
                "}";
        urlConnection.setDoOutput(true);
        urlConnection.getOutputStream().write(requestBody.getBytes("utf-8"));

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        String inputLine;
        //获取请求结果
        StringBuffer stringBuffer = new StringBuffer();
        while ((inputLine = bufferedReader.readLine()) != null) {
            stringBuffer.append(inputLine);
        }
        String s = http.get(3);
        System.out.println(s);
        bufferedReader.close();

        System.out.println("response code : " + urlConnection.getResponseCode());
        System.out.println("response body : " + stringBuffer.toString());
        String result = stringBuffer.toString();
        JsonObject jsonObject = new Gson().fromJson(result, JsonObject.class);
        JsonElement jsonElement = jsonObject.getAsJsonObject("data").get("token");
        String token = "";
        if (jsonElement != null) {
            token = jsonElement.getAsString();
        }
        String usefulConn = s + token;
        System.out.println(usefulConn);
    }
}

