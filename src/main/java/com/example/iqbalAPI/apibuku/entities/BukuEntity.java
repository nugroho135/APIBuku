package com.example.iqbalAPI.apibuku.entities;


import javax.persistence.*;

@Entity
@Table(name = "buku")
public class BukuEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String idBuku;
    private String judul;
    private String pengarang;
    private String penerbit;
    private String tglterbit;
    private String tebalbuku;

    public String getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(String idBuku) {
        this.idBuku = idBuku;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getTglterbit() {
        return tglterbit;
    }

    public void setTglterbit(String tglterbit) {
        this.tglterbit = tglterbit;
    }

    public String getTebalbuku() {
        return tebalbuku;
    }

    public void setTebalbuku(String tebalbuku) {
        this.tebalbuku = tebalbuku;
    }

    @Override
    public String toString() {
        return "BukuEntity{" +
                "id=" + id +
                ", idBuku='" + idBuku + '\'' +
                ", judul='" + judul + '\'' +
                ", pengarang='" + pengarang + '\'' +
                ", penerbit='" + penerbit + '\'' +
                ", tglterbit='" + tglterbit + '\'' +
                ", tebalbuku='" + tebalbuku + '\'' +
                '}';
    }
}
