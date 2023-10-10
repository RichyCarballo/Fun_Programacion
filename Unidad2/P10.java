/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p10;

import java.util.Scanner;

/**
 *
 * @author LaboratorioLTI2
 */
public class P10 {

    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        int L,P,A,a;
        System.out.print("Introduce el valor de uno de los lados ");
        L = sc.nextInt ();
        P = L * 6;
        System.out.print("Introduce el valor de la apotema ");
        A = sc.nextInt ();
        a = (P * A) / 2;
        
        System.out.print("El ´área del hexagono es: " + a);
    }
}