package com.hmtmcse.httputil


import spock.lang.Specification

class HttpRequestTest extends Specification {

    public static String baseUrl = "http://localhost:8080/requestTesting/"


    def "GET Request to Server"() {

        expect: "Http Get Request Test"
        try {
            HttpUtil httpUtil = new HttpUtil();
            httpUtil.getRequest(baseUrl + "httpGetRequest");
            HttpResponse response = httpUtil.send();
            System.out.println(response.getHttpCode());
            System.out.println(response.getContent());
        } catch (HttpExceptionHandler e) {
            System.out.println(e.getMessage());
        }
    }

    def "POST Request to Server"(){
        expect: "Http Post Request Test"
        try {
            HttpUtil httpUtil = new HttpUtil();
            httpUtil.post(baseUrl + "httpPostRequest");
            HttpResponse response = httpUtil.send();
            System.out.println(response.getHttpCode());
            System.out.println(response.getContent());
        } catch (HttpExceptionHandler e) {
            System.out.println(e.getMessage());
        }
    }

    def "POST Request With Params to Server"(){
        expect: "Http Post Request With Params Test"
        try {
            HttpUtil httpUtil = new HttpUtil();
            httpUtil.post(baseUrl + "httpPostRequestWithParams");
            httpUtil.addParam("name", "H.M.Touhid Mia");
            httpUtil.addParam("data", "Data");
            HttpResponse response = httpUtil.send();
            System.out.println(response.getHttpCode());
            System.out.println(response.getContent());
        } catch (HttpExceptionHandler e) {
            System.out.println(e.getMessage());
        }
    }

    def "PUT Request to Server"(){
        expect: "Http Post Request Test"
        try {
            HttpUtil httpUtil = new HttpUtil();
            httpUtil.put(baseUrl + "httpPutRequest");
            HttpResponse response = httpUtil.send();
            System.out.println(response.getHttpCode());
            System.out.println(response.getContent());
        } catch (HttpExceptionHandler e) {
            System.out.println(e.getMessage());
        }
    }

    def "DELETE Request to Server"(){
        expect: "Http Delete Request Test"
        try {
            HttpUtil httpUtil = new HttpUtil();
            httpUtil.delete(baseUrl + "httpDeleteRequest");
            HttpResponse response = httpUtil.send();
            System.out.println(response.getHttpCode());
            System.out.println(response.getContent());
        } catch (HttpExceptionHandler e) {
            System.out.println(e.getMessage());
        }
    }

    def "GET Request With Custom Header to Server"(){
        expect: "Http Get Request With Custom Header Test"
        try {
            HttpUtil httpUtil = new HttpUtil();
            httpUtil.getRequest(baseUrl + "httpGetRequestWithHeader");
            httpUtil.addHeader("access_token", "yup this is access token");
            HttpResponse response = httpUtil.send();
            System.out.println(response.getHttpCode());
            System.out.println(response.getContent());
        } catch (HttpExceptionHandler e) {
            System.out.println(e.getMessage());
        }
    }

    def "POST JSON Request to Server"(){
        expect: "Http JSON Post Request Test"
        try {
            HttpUtil httpUtil = new HttpUtil();
            String json = "{\"name\":\"Touhid Mia\",\"date\":\"This is Data.\"}";
            httpUtil.jsonPost(baseUrl + "httpJsonPostRequest", json);
            HttpResponse response = httpUtil.send();
            System.out.println(response.getHttpCode());
            System.out.println(response.getContent());
        } catch (HttpExceptionHandler e) {
            System.out.println(e.getMessage());
        }
    }

    def "PUT JSON Request to Server"(){
        expect: "Http JSON Put Request Test"
        try {
            HttpUtil httpUtil = new HttpUtil();
            String json = "{\"name\":\"Touhid Mia\",\"date\":\"This is Data.\"}";
            httpUtil.jsonPut(baseUrl + "httpJsonPutRequest", json);
            HttpResponse response = httpUtil.send();
            System.out.println(response.getHttpCode());
            System.out.println(response.getContent());
        } catch (HttpExceptionHandler e) {
            System.out.println(e.getMessage());
        }
    }

    def "DELETE JSON Request to Server"(){
        expect: "Http JSON Delete Request Test"
        try {
            HttpUtil httpUtil = new HttpUtil();
            String json = "{\"name\":\"Touhid Mia\",\"date\":\"This is Data.\"}";
            httpUtil.jsonDelete(baseUrl + "httpJsonDeleteRequest", json);
            HttpResponse response = httpUtil.send();
            System.out.println(response.getHttpCode());
            System.out.println(response.getContent());
        } catch (HttpExceptionHandler e) {
            System.out.println(e.getMessage());
        }
    }

    def "Upload POST Request to Server Multipart"(){
        expect: "Http Multipart Post Request Test"
        try {
            HttpUtil httpUtil = new HttpUtil();
            httpUtil.multipartPost(baseUrl + "httpMultipartPostRequest");
            httpUtil.addParam("name", "Touhid Mia");
            httpUtil.addParam("file", new File("I:\\start.sh"));
            httpUtil.addParam("file2", new File("I:\\start.sh"));
            HttpResponse response = httpUtil.send();
            System.out.println(response.getHttpCode());
            System.out.println(response.getContent());
        } catch (HttpExceptionHandler e) {
            System.out.println(e.getMessage());
        }
    }

    def "Upload POST Without file Request to Server Multipart"(){
        expect: "Http Multipart Post Request without file Test"
        try {
            HttpUtil httpUtil = new HttpUtil();
            httpUtil.multipartPost(baseUrl + "httpMultipartPostWithoutFileRequest");
            httpUtil.addParam("name", "Touhid Mia");
            HttpResponse response = httpUtil.send();
            System.out.println(response.getHttpCode());
            System.out.println(response.getContent());
        } catch (HttpExceptionHandler e) {
            System.out.println(e.getMessage());
        }
    }


    def "Upload Put Request to Server Multipart"(){
        expect: "Http Multipart Put Request Test"
        try {
            HttpUtil httpUtil = new HttpUtil();
            httpUtil.multipartPut(baseUrl + "httpMultipartPutRequest");
            httpUtil.addParam("name", "Touhid Mia");
            httpUtil.addParam("file", new File("I:\\start.sh"));
            HttpResponse response = httpUtil.send();
            System.out.println(response.getHttpCode());
            System.out.println(response.getContent());
        } catch (HttpExceptionHandler e) {
            System.out.println(e.getMessage());
        }
    }


    def "Download from server by GET Request"(){
        expect: "Http Download by GET Request Test"
        try {
            HttpUtil httpUtil = new HttpUtil();
            httpUtil.download("http://localhost/wordpress.zip", "G:\\download", "abc.zip");
            HttpResponse response = httpUtil.send();
            System.out.println(response.getHttpCode());
            System.out.println(response.getContent());
        } catch (HttpExceptionHandler e) {
            System.out.println(e.getMessage());
        }
    }

    def "Download from server by POST Request"(){
        expect: "Http Download by POST Request Test"
        try {
            HttpUtil httpUtil = new HttpUtil();
            httpUtil.postDownload("http://localhost/wordpress.zip", "G:\\download", "abc-post.zip");
            HttpResponse response = httpUtil.send();
            System.out.println(response.getHttpCode());
            System.out.println(response.getContent());
        } catch (HttpExceptionHandler e) {
            System.out.println(e.getMessage());
        }
    }

}
