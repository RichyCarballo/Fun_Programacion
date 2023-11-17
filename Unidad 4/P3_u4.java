/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p3_u4;
import java.util.Scanner;
/**
 *
 * @author richy
 */
public class P3_u4 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        double f = 0, k= 0;
         int temperaturaT;

            System.out.println("Ingrese la cantidad de temperaturas a procesar: ");
            temperaturaT = sc.nextInt();

            double[] temperaturaC = new double[temperaturaT];
            for (int i = 0; i < temperaturaT; i++)
            {
                System.out.println("Ingrese la temperatura en Celsius: ");
                temperaturaC[i] = sc.nextInt();

                f = temperaturaC[i] * (9 / 5) + 32;
                System.out.println("Temperatura en Farenheit: " + f);

                k = temperaturaC[i] + 273.15;
                System.out.println("Temperatura en Kelvin: " + k);
            }

        }
    }
