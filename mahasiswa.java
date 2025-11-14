/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author payen
 */
public class mahasiswa {
    private String nama;
    private prodi prodi;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(prodi prodi) {
        this.prodi = prodi;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi.getNama();
    }

    public void displayMahasiswa() {
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Prodi          : " + prodi.getNama());
        System.out.println("-----------------------------------");
    }
}
