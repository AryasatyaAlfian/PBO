/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author payen
 */
public class SepedaMotor {
    protected String warnaMotor;
    protected int ukuranTangki;
    protected LocalDateTime waktuIsiBensin;

    public SepedaMotor(String warnaMotor) {
        this.warnaMotor = warnaMotor;
        this.ukuranTangki = 3;
        this.waktuIsiBensin = null;
    }

    public void isiTangkiFull() {
        this.waktuIsiBensin = LocalDateTime.now();
        System.out.println("Tangki telah diisi penuh pada " + waktuIsiBensin.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
    }

    public LocalDateTime cekKapanHabis() {
        if (waktuIsiBensin == null) {
            System.out.println("Bensin belum diisi.");
            return null;
        } else {
            return waktuIsiBensin.plusHours(ukuranTangki);
        }
    }

    public boolean jalan() {
        if (waktuIsiBensin == null) {
            System.out.println("Bensin habis, sepeda motor tidak dapat berjalan");
            return false;
        } else {
            System.out.println("Sepeda motor sedang berjalan");
            return true;
        }
    }
}
