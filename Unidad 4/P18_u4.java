/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p18_u4;

/**
 *
 * @author LaboratorioLTI2
 */
public class P18_u4 {

    public static void main(String[] args) {
        int diag[][]= { {1, 2, 3} , {4, 5, 6} , {7, 8, 9} };
        System.out.println("Diagonal principal: ");
        for (int c=0; c< diag.length; c++){
         System.out.print(diag[c][c]+" ");
        }
        System.out.println("\nDiagonal inversa: ");
       for (int i=0; i<3; i++ ){
       System.out.print(diag[i][diag.length -1-i]+" ");
       }
        
       System.out.println("\nDiagonal secundaria: ");
       for (int i=1; i<3; i++ ){
        System.out.print(diag[i][i-1]+" ");
       }
    }
}
