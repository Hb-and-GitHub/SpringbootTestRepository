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

public class GetTicket {
    public static void main(String[] args) throws Exception {
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
    }
}
