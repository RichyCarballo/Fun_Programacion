
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p3_u5;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class P3_u5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double x, y;
        System.out.println("Escribe el valor de x: ");
        x= sc.nextDouble();
        System.out.println("Escribe el valor de y: ");
        y= sc.nextDouble();
        System.out.println("Resultado ecuacion1: "+ecuacion1(x,y));
        System.out.println("Resultado ecuacion2: "+ecuacion2(x,y));
    }
    public static double ecuacion1(double x, double y){
    double r;
    r = Math.pow(x, 2)+(2*Math.pow(y, 4));
    return r;
    }
    public static double ecuacion2(double x, double y){
     double r;
     r= Math.sqrt(Math.pow(x,4)+5*y);
     return r;
    }
}

