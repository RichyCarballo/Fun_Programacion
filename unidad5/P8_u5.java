/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p8_u5;
import java.util.Random;
/**
 *
 * @author richy
 */
public class P8_u5 {

    public static void main(String[] args) {
       dado();
    }
    public static void dado(){
        Random ale = new Random();
        int x= ale.nextInt(6);
        System.out.println("Numero de cara del dado: "+x);
    }
}
