package com.hmtmcse.httputil;

import java.io.UnsupportedEncodingException;
import java.net.*;
import java.util.ArrayList;
import java.util.List;

public class HttpRequest {

    public static final String APPLICATION_FORM_URLENCODED = "application/x-www-form-urlencoded";
    public final static String APPLICATION_JSON = "application/json";
    public static final String POST = "POST";
    public static final String GET = "GET";
    public static final String PUT = "PUT";
    public static final String DELETE = "DELETE";
    public static final String DELETE_POST = "DELETE_POST";

    protected Integer connectionTimeout = 30000;
    protected Integer fileBufferSize = 1024;
    protected String userAgent = "HMTMCSE/1.0";

    protected String httpMethod = GET;
    protected String url = null;
    protected String params = null;
    protected String contextType = APPLICATION_FORM_URLENCODED;
    protected List<RequestHeader> headers = new ArrayList<>();
    protected Boolean isEnableRedirectHandle = false;
    protected Boolean isDownload = false;
    protected String fileName;
    protected String defaultDownloadFileName = "download.dat";
    protected String filePath;

    public Integer getConnectionTimeout() {
        return connectionTimeout;
    }

    public void setConnectionTimeout(Integer connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    public Integer getFileBufferSize() {
        return fileBufferSize;
    }

    public void setFileBufferSize(Integer fileBufferSize) {
        this.fileBufferSize = fileBufferSize;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getContextType() {
        return contextType;
    }

    public void setContextType(String contextType) {
        this.contextType = contextType;
    }

    public List<RequestHeader> getHeaders() {
        return headers;
    }

    public void setHeaders(List<RequestHeader> headers) {
        this.headers = headers;
    }


    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }




    public String toURL(String myUrl){
        try {
            String decodedURL = URLDecoder.decode(myUrl, "UTF-8");
            URL _url = new URL(decodedURL);
            URI uri = new URI(_url.getProtocol(), _url.getUserInfo(), _url.getHost(), _url.getPort(), _url.getPath(), _url.getQuery(), _url.getRef());
            return uri.toString();
        } catch (MalformedURLException | UnsupportedEncodingException | URISyntaxException e) {
            return myUrl;
        }
    }


    public String urlEncode(String value){
        try {
            return URLDecoder.decode(value, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            return value;
        }
    }

    public String getDefaultDownloadFileName() {
        return defaultDownloadFileName;
    }

    public void setDefaultDownloadFileName(String defaultDownloadFileName) {
        this.defaultDownloadFileName = defaultDownloadFileName;
    }
}
