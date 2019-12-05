package com.hmtmcse.httputil;

public class UploadFileData {

    public String mimeType;
    public String fileName;

    public UploadFileData() {}

    public UploadFileData(String mimeType) {
        this.mimeType = mimeType;
    }

    public UploadFileData(String mimeType, String fileName) {
        this.mimeType = mimeType;
        this.fileName = fileName;
    }

    public String getMimeType() {
        return mimeType;
    }

    public UploadFileData setMimeType(String mimeType) {
        this.mimeType = mimeType;
        return this;
    }

    public String getFileName() {
        return fileName;
    }

    public UploadFileData setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
}
