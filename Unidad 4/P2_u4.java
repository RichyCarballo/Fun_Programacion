/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p2_u4;

/**
 *
 * @author richy
 */
public class P2_u4 {

    public static void main(String[] args) {
        int[] cal = {100, 100, 100, 100, 100, 100, 100, 100, 100, 100};
            double promedio = 0, suma = 0;

            for (int i = 0; i < 10; i++)
            {
                suma = suma + cal[i];
                promedio = suma / 10;
            }
            System.out.println("El promedio de tus califiaciones es: " + promedio);
        }
    }
