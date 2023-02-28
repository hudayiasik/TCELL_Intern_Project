package com.mailservice.app1.model;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


//@AllArgsConstructor
//@NoArgsConstructor
@Entity
@EntityScan
@Table(name = "domainler")
public class Domain implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long domainID;

    @Column(name = "ip")
    private String ip;


    public Long getDomainID() {
        return domainID;
    }

    public void setDomainID(Long domainID) {
        this.domainID = domainID;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}