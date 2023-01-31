package com.example.iqbalAPI.apibuku.entities;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "statusbuku")
public class StatusBukuEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int status;
    private String peminjam;
    private String tglpinjam;
    private String tglkembali;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getPeminjam() {
        return peminjam;
    }

    public void setPeminjam(String peminjam) {
        this.peminjam = peminjam;
    }

    public String getTglpinjam() {
        return tglpinjam;
    }

    public void setTglpinjam(String tglpinjam) {
        this.tglpinjam = tglpinjam;
    }

    public String getTglkembali() {
        return tglkembali;
    }

    public void setTglkembali(String tglkembali) {
        this.tglkembali = tglkembali;
    }

    @Override
    public String toString() {
        return "StatusBukuEntity{" +
                "id=" + id +
                ", status=" + status +
                ", peminjam='" + peminjam + '\'' +
                ", tglpinjam='" + tglpinjam + '\'' +
                ", tglkembali='" + tglkembali + '\'' +
                '}';
    }
}
