/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerc12;

import java.util.Scanner;

/**
 *
 * @author David R.L
 */
public class Ejerc12 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int A=entrada.nextInt();
        int B=entrada.nextInt();
        int C=entrada.nextInt();
        int D;
        double Sol1,Sol2;
        D=(B*B)-(4*A*C);
        if(D<0){
            System.out.println("Su ecuacion no tiene solucion en los reales");
        }
        else if(D==0){
            Sol1=(-B)/(2*A);
            System.out.println("Su ecuacion tiene una solucion en los reales "+Sol1);
        }
        else{
            Sol1=(-B+Math.sqrt(D))/(2*A);
            Sol2=(-B-Math.sqrt(D))/(2*A);
            System.out.println("Su ecuacion tiene 2 soluciones en los reales "+Sol1+" y "+Sol2);
            
        }
    }
}
