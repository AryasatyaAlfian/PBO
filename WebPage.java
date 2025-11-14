/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author payen
 */
public class WebPage implements Loginable {
    protected String webTitle;
    protected String loggedUsername;

    public WebPage(String title) {
        this.webTitle = title;
    }

    public void showHeader() {
        System.out.println("########################################");
        System.out.println("##         " + webTitle + "         ##");
        System.out.println("##------------------------------------##");
    }

    public void showFooter() {
        System.out.println("##------------------------------------##");
        System.out.println("##     Created by Muh Alfian Aryasatya Nugraha Mattengnga       ##");
        System.out.println("########################################");
    }

    public void showFullPage() {
        showHeader();
        showMainPage();
        showFooter();
    }

    protected void showMainPage() {

    }

    @Override
    public void login(String input) {
        
    }
}