package com.manulife.api;

import com.alibaba.fastjson.JSON;
import okhttp3.*;

import java.util.Map;

/**
 * @author liuch
 * @date 2020/2/3 - 20:45
 */
public class OkHttpUtils {
    public static void send(Request request){
        OkHttpClient httpClient = new OkHttpClient();
        try {
            Response execute = httpClient.newCall(request).execute();
            String result = execute.body().string();
            System.out.println("response messege:" + result);
        }catch (Exception e){
            System.out.println(e);
        }
    }

}
