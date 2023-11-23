/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p15u4;

/**
 *
 * @author LaboratorioLTI2
 */
public class P15U4 {

    public static void main(String[] args) {
        int [][] matriz = new int [3][3];
        matriz[0][0]=5;
        matriz[1][1]=5;
        matriz[2][2]=3;
        
        System.out.println("Contenido del arreglo: ");
        for (int w=0; w<3;w++){
           System.out.println(matriz[w][w]);
        }
        int media;
        media= (matriz[0][0]+matriz[1][1]+matriz[2][2])/3;
        System.out.println("suma de los arreglos de la matriz: "+media);
    }
}
