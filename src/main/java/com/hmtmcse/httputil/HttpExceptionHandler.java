package com.hmtmcse.httputil;

/**
 * Created by Touhid Mia on 11/09/2014.
 */
public class HttpExceptionHandler extends Exception {

    public HttpExceptionHandler(){
        super("HTTP Exception Occurred!");
    }

    public HttpExceptionHandler(String message){
        super(message);
    }
}
