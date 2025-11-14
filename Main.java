/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.main;

/**
 *
 * @author payen
 */
public class Main {

    public static void main(String[] args) {
        prodi pr1 = new prodi();
        prodi pr2 = new prodi();

        pr1.setNama("Informatika");
        pr2.setNama("Data Science");

        mahasiswa mhs1 = new mahasiswa();
        mahasiswa mhs2 = new mahasiswa();

        mhs1.setNama("Bruce Wayne");
        mhs1.setProdi(pr1);

        mhs2.setNama("Tony Stark");
        mhs2.setProdi(pr2);

        System.out.println("=== Data Mahasiswa ===");
        mhs1.displayMahasiswa();
        mhs2.displayMahasiswa();
    }
}
