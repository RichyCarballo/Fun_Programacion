/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p5_u5;
import java.util.Scanner;
/**
 *
 * @author richy
 */
public class P5_u5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String pal = sc.nextLine();
        System.out.println(pal+" tiene un total de: "+palabra(pal)+" letras");
    }
    public static int palabra(String x){
        int p = x.length();
        return p;
    }
}
