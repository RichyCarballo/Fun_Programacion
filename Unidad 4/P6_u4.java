/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p6_u4;
import java.util.Arrays;

 
/**
 *
 * @author richy
 */
public class P6_u4 {

    public static void main(String[] args) {
            int[] numeros = { 4, 2, 9, 1, 8, 0, 3, 6 };

        Arrays.sort(numeros);

        System.out.println("Arreglo Ordenado:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}