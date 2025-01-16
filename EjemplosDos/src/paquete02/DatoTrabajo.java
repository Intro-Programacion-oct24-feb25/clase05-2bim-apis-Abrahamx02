/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
import java.util.Scanner;
public class DatoTrabajo {
    // método que permita preguntar al usuario el nombre de la empresa
    public static String nombreUs (){
        Scanner entrada = new Scanner (System.in);
        System.out.println("ingrese el nombre de la empresa");
        String nombreEmpresa = entrada.nextLine();
        
       return nombreEmpresa; 
    }
    // método que permita preguntar al usuario la dirección de la empresa
     public static String directionUs (){
        Scanner entrada = new Scanner (System.in);
        System.out.println("ingrese la direccion de la empresa");
        String directionEmpresa = entrada.nextLine();
        
       return directionEmpresa; 
    }
}
