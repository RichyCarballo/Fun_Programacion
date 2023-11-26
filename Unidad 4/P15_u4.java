/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p15_u4;

/**
 *
 * @author richy
 */
public class P15_u4 {

    public static void main(String[] args) {
        int[][] cali = new int[3][3];
     cali [0][0]= 5;
     cali [1][1]= 7;
     cali [2][2]= 9;
   
   
     
   System.out.println("los datos son");
    for(int i=0; i<3; i++){
   
   System.out.println(cali[i][i]);
    }
    int media ;
    media = (cali[0][0] + cali[1][1] + cali[2][2])/3;
     System.out.println("la suma de los datos es " + media);
    
        
        
    }
}