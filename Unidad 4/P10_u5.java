/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p10_u5;
import java.util.Random;
/**
 *
 * @author LaboratorioLTI2
 */
public class P10_u5 {

    public static void main(String[] args) {
        int longitud=8;
        String contrasena = aleatorio(longitud);
        System.out.println("password"+contrasena);
      
    
    }
    public static String aleatorio(int longitud){
     String caracteres = "ABCDEFGHIJK123456789*-_.";
     Random random = new Random();
     StringBuilder cadena= new StringBuilder(longitud);
     for(int i=0;i< longitud; i++){
     int indiceCaracter = random.nextInt(caracteres.length());
     cadena.append(caracteres.charAt(indiceCaracter));
     } 
     return cadena.toString();
    }
}
