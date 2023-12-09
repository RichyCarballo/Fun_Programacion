/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p4_u5;
import java.util.Scanner;
/**
 *
 * @author richy
 */
public class P4_u5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = sc.nextInt();
        System.out.println(num+" "+primo(num));
    }

    public static String primo(int x){  
        int c=0;
        String p;
        for(int i=x; i>0; i--){
            if(x%i==0){
                c++;
            }
        }
        if(c==2){
            p = "es numero primo";
        }else{
            p = "no es numero primo";
        }
         return p.toString();
    }
   
}
