package com.mailservice.app1.requests;

import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class DomainRequest {

    String name;
    String ip;
    @Id
    private long id;
    //List users
    public DomainRequest(String name,String ip){
        this.name = name;
        this.ip = ip;
    }

    public long getId() {
        return id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DomainRequest{" +
                "name='" + name + '\'' +
                ", ip='" + ip + '\'' +
                ", id=" + id +
                '}';
    }
}
