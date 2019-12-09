package com.hmtmcse.httputil.test;

import com.hmtmcse.httputil.HttpExceptionHandler;
import com.hmtmcse.httputil.HttpResponse;
import com.hmtmcse.httputil.HttpUtil;

public class Main {


    public static void main(String[] args) {
        try {
            HttpUtil httpUtil = new HttpUtil();
            httpUtil.getRequest("http://www.hmtmcse.com/");
            HttpResponse response = httpUtil.send();
            System.out.println(response.getHttpCode());
            System.out.println(response.getContent());
        } catch (HttpExceptionHandler e) {
            System.out.println(e.getMessage());
        }
    }

}
