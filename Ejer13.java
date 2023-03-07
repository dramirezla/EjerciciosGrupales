/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejer13;

import java.util.Scanner;

/**
 *
 * @author David R.L
 */
public class Ejer13 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int A=entrada.nextInt();
        int B=entrada.nextInt();
        int C=entrada.nextInt();
        if(A>B && A>C){
            System.out.println("La esfera mas pesada es A");
        }
        else if(B>A && B>C){
            System.out.println("La esfera mas pesada es la B");
        }
        else if(C>A && C>B){
            System.out.println("La esfera mas pesada es la C");
        }
        else{
            System.out.println("Todas las esferas pesan lo mismo");
        }
    }
}
