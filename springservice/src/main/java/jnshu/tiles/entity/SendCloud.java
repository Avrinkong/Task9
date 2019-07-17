package jnshu.tiles.entity;

import java.io.Serializable;

public class SendCloud implements Serializable {

    private static final long serialVersionUID = 248682761535504807L;
    private String apiUser;
    private String apiKey;
    private String rcpt_to;
    private String subject;
    private String html;

    public SendCloud(){

    }

    public String getApiUser() {
        return apiUser;
    }

    public void setApiUser(String apiUser) {
        this.apiUser = apiUser;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getRcpt_to() {
        return rcpt_to;
    }

    public void setRcpt_to(String rcpt_to) {
        this.rcpt_to = rcpt_to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }
}
