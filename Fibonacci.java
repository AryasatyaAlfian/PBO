/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fibonacci;

import java.util.Scanner;

/**
 *
 * @author payen
 */
public class Fibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan n: ");
        int n = input.nextInt();
        
        if (n <= 0) {
            System.out.println("Input harus lebih besar dari 0!");
        } else {
            int a = 1, b = 1;
            System.out.print("Output: ");
            
            for (int i = 1; i <= n; i++) {
                System.out.print(a + " ");
                int next = a + b;
                a = b;
                b = next;
            }
        }
        
        input.close();
    }
}
