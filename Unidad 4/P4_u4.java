/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p4_u4;
import java.util.Scanner;
/**
 *
 * @author richy
 */
public class P4_u4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n=0, num;
            System.out.println("Ingrese los números a procesar: ");
            num = sc.nextInt();

            int[] neg = new int[num];

            for (int ne = 0; ne < neg.length; ne++)
            {
                System.out.println("Escribe un número en indice3 " + ne + ": "); 
                neg[ne] = sc.nextInt();

                if (neg[ne] < 0)
                {
                    ne++;
                }
                System.out.println("Hay un total de " + ne + " números negativos.");
            }

        }
    }
