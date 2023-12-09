/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p6_u5;

/**
 *
 * @author richy
 */
public class P6_u5 {

    public static void main(String[] args) {
        f();
    }
    public static void f() {
        int a=0, b=1, c=0;
        for(int i=0; i<=10; i++){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}