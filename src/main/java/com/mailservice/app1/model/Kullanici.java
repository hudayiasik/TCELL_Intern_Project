package com.mailservice.app1.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

/**
 *
 * @author Hudayi
 */
@Entity
@Table(name = "kullanici")
public class Kullanici implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String kullaniciID;

    @Column(name = "kullaniciadsoyad")
    private String adSoyad;

    @Column(name = "kullanicisifre")
    private String sifre;

    @Column(name = "kullanicimail")
    private String mail;


    public Kullanici(String kullaniciID, String adSoyad, String sifre, String mail) {
        this.kullaniciID = kullaniciID;
        this.adSoyad = adSoyad;
        this.sifre = sifre;
        this.mail = mail;
    }

    public Kullanici() {
    }

    /**
     * @return the kullaniciID
     */
    public String getKullaniciID() {
        return kullaniciID;
    }

    /**
     * @param kullaniciID the kullaniciID to set
     */
    public void setKullaniciID(String kullaniciID) {
        this.kullaniciID = kullaniciID;
    }

    /**
     * @return the adSoyad
     */
    public String getAdSoyad() {
        return adSoyad;
    }

    /**
     * @param adSoyad the adSoyad to set
     */
    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    /**
     * @return the sifre
     */
    public String getSifre() {
        return sifre;
    }

    /**
     * @param sifre the sifre to set
     */
    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    /**
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * @return the sehirID
     */

    @Override
    public String toString() {
        return "\n Ad Soyad: " + this.getAdSoyad() +
                "\n Kullanıcı ID: " + this.getKullaniciID() +
                "\n Mail ID" + this.getMail() +
                "\n Sifre" + this.getSifre();
    }

}
