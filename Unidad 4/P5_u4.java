/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p5_u4;
import java.util.Scanner;
/**1
 * 
 *
 * @author richy
 */
public class P5_u4 {

    public static void main(String[] args) {
         Scanner sc=new Scanner (System.in); 
        int f;

            System.out.println("Ingrese las frutas a procesar: ");
            f = sc.nextInt();

            int[] frutas = new int[f];

            for (int i = 0; i < frutas.length; i++)
            {
                System.out.println("Escribe una fruta en indice " + i + ": ");
                frutas[i] = sc.nextInt();
            }


        }
    }
