/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa17;
import java.util.Scanner;

/**
 *
 * @author LaboratorioLTI2
 */
public class Programa17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int dia;
        System.out.print("Escribe el dia de la semana numerico: ");
        dia= sc.nextInt();
        switch (dia){
                case 1 :
                    System.out.println("Lunes");
                    break;
                case 2 :
                    System.out.println("Martes");
                    break;
                case 3 :
                    System.out.println("Miercoles");
                    break;
                case 4 :
                    System.out.println("Jueves");
                    break;
                case 5 :
                    System.out.println("Viernes");
                    break;
                case 6 :
                    System.out.println("Sabado");
                    break;
                case 7 :
                    System.out.println("Domingo");
                default :
                    System.out.println("No existe");
        }   
        
    }
}
