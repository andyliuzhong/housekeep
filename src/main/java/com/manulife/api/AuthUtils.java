package com.manulife.api;

import com.alibaba.fastjson.JSON;
import okhttp3.*;

import java.io.IOException;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @author liuch
 * @date 2020/2/3 - 18:19
 */
public class AuthUtils {
    private static final String AUTH_URL = "";

    public static void main(String[] args) throws IOException {
        getToken();
    }
    public static String getToken(){
        String token = "";
        String body = "{\"uid\":2,\"name\":\"test\"}";
        OkHttpClient httpClient = new OkHttpClient.Builder()
                .connectTimeout(300, TimeUnit.SECONDS)
                .readTimeout(20,TimeUnit.SECONDS).build();
        Request request = new Request.Builder()
                .url("http://127.0.0.1:8080/oktest")
                .post(RequestBody.create(MediaType.get("application/json; charset=utf-8"),body))
                .build();
        try {
            Response execute = httpClient.newCall(request).execute();
            String result = execute.body().string();
            Map<String,String> map = (Map<String, String>) JSON.parse(result);
            System.out.println(map.get("name"));
            token =  map.get("name");
        }catch (Exception e){
            System.out.println(e);
        }
        return token;
    }
}
