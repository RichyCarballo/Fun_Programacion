/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p7;

import java.util.Scanner;

/**
 *
 * @author LaboratorioLTI2
 */
public class P7 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int m;
        double p;
        System.out.print("Introduce el valor de los metros: ");
        m = sc.nextInt ();
        p = m * 3.28;
        System.out.print("La conversión a pies es: " + p);

    }
}