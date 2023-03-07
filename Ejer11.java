/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejer11;

/**
 *
 * @author David R.L
 */
import java.util.*;
public class Ejer11 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String nombre=entrada.next();
        int salario=entrada.nextInt();
        int horas=entrada.nextInt();
        int salario_men=salario*horas;
        if(salario_men>450000){
            System.out.println(nombre+" Tiene un salario mensual de: "+salario_men);
        }
        else{
            System.out.println(nombre);
        }
    }
}
