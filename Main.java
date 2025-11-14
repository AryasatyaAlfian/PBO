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
        HomePage home = new HomePage("Home Page");
        DashboardPage dash = new DashboardPage("Dashboard Page");

        System.out.println("===== Sebelum Login =====");
        home.showFullPage();
        dash.showFullPage();

        System.out.println("\n===== Setelah Login =====");
        home.login("Alfian");
        dash.login("Alfian");

        home.showFullPage();
        dash.showFullPage();
    }
}