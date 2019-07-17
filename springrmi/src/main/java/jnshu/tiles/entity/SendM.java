package jnshu.tiles.entity;

import java.io.Serializable;

public class SendM implements Serializable {
    private static final long serialVersionUID = 1028642223136554841L;
    private String singName;

    private String templateCode;

    private String accessKeyId;

    private String secret;

    private String endpoint;

    private String bucketName;

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public SendM() {
    }

    public SendM(String singName, String templateCode, String accessKeyId, String secret) {
        this.singName = singName;
        this.templateCode = templateCode;
        this.accessKeyId = accessKeyId;
        this.secret = secret;
    }

    public String getSingName() {
        return singName;
    }

    public void setSingName(String singName) {
        this.singName = singName;
    }

    public String getTemplateCode() {
        return templateCode;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }

    public String getAccessKeyId() {
        return accessKeyId;
    }

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }
}
