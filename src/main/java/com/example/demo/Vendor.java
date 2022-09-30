package com.example.demo;

public class Vendor {
  public int id;
    public String name;
    public String deskripsi;
    public String alamat;
    public String telepon;
    public String website;

 
    // Student class constructor
    Vendor(int id, String name, String deskripsi, String alamat, String telepon, String website)
    {
        this.id = id;
        this.name = name;
        this.deskripsi = deskripsi;
        this.alamat = alamat;
        this.telepon = telepon;
        this.website = website;
    }
}
