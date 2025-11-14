/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author payen
 */
public class HandoBaet extends SepedaMotor {
    public HandoBaet(String warnaMotor) {
        super(warnaMotor);
        this.ukuranTangki = 4;
    }

    @Override
    public boolean jalan() {
        if (waktuIsiBensin == null) {
            System.out.println("Bensin habis, sepeda motor tidak dapat berjalan");
            return false;
        } else {
            System.out.println("Sepeda motor sedang berjalan");
            System.out.println("Moto Baet akan habis bensin pada " +
                cekKapanHabis().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
            return true;
        }
    }
}