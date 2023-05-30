/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Lab Informatika
 */
public class Perpus {
    private int Id, Stock;
    private String Judul, Penerbit, Penulis, Genre, Lokasi;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public String getJudul() {
        return Judul;
    }

    public void setJudul(String Judul) {
        this.Judul = Judul;
    }

    public String getPenerbit() {
        return Penerbit;
    }

    public void setPenerbit(String Penerbit) {
        this.Penerbit = Penerbit;
    }

    public String getPenulis() {
        return Penulis;
    }

    public void setPenulis(String Penulis) {
        this.Penulis = Penulis;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    public String getLokasi() {
        return Lokasi;
    }

    public void setLokasi(String Lokasi) {
        this.Lokasi = Lokasi;
    }
    
    
}
