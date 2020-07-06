package com.mingqi.goTravel.pojo;

import java.util.Date;

public class Log {
    private Integer id;

    private Date visittime;

    private String username;

    private String ip;

    private String url;

    private Integer excutiontime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getVisittime() {
        return visittime;
    }

    public void setVisittime(Date visittime) {
        this.visittime = visittime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getExcutiontime() {
        return excutiontime;
    }

    public void setExcutiontime(Integer excutiontime) {
        this.excutiontime = excutiontime;
    }
}