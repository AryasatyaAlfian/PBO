/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matriks;

import java.util.Scanner;

/**
 *
 * @author payen
 */
public class Matriks {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Perkalian matriks n*n ");
        System.out.print("n: ");
        int n = input.nextInt();

        int[][] matrix1 = new int[n][n];
        int[][] matrix2 = new int[n][n];
        int[][] hasil = new int[n][n];

        System.out.println("Isi matriks 1:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }

        System.out.println("Isi matriks 2:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                hasil[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    hasil[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("Matriks 1:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriks 2:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Hasil perkalian:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}


