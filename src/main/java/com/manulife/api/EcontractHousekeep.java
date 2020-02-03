package com.manulife.api;

import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;

import java.util.Date;

/**
 * @author liuch
 * @date 2020/2/3 - 20:48
 */
public class EcontractHousekeep {
    public static void main(String[] args) {
        System.out.println("start date :" + new Date());
        Request request = new Request.Builder()
                .url("http://127.0.0.1:8080/oktest")
                .delete()
                .build();
        OkHttpUtils.send(request);
        System.out.println("end date :" + new Date());
    }
}
