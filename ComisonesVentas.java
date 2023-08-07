/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comisonesventas;

import java.util.Scanner;

/**
 *
 * @author Cesar Perez
 */
public class ComisonesVentas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int sueldo= 200;
        double ventas= 0.09;
        double articulo1= 239.99;
        double articulo2= 129.75;
        double articulo3= 99.95;
        double articulo4= 350.89;
        double comision= 0;
        double resultado= 0;
        int articulo;
        
        Scanner entrada= new Scanner(System.in);
        
        System.out.printf("Ingresa la cantidad de camisas que vendio el empleado: ");
        articulo= entrada.nextInt();
        double camisas= articulo*articulo1;
        
        
        System.out.printf("Ingresa la cantidad de corbatas que vendio el empleado: ");
        articulo= entrada.nextInt();
        double corbatas= articulo*articulo2;
        
        
        System.out.printf("Ingresa la cantidad de pañuelos que vendio el empleado: ");
        articulo= entrada.nextInt();
        double panuelos= articulo*articulo3;
        
        
        System.out.printf("Ingresa la cantidad de pantalones que vendio el empleado: ");
        articulo= entrada.nextInt();
        double pantalones= articulo*articulo4;
        
        resultado= camisas+ corbatas+ panuelos+ pantalones;
        
        comision=(resultado*ventas)+sueldo;
        
        System.out.printf("El sueldo semanal del empleado es: %s ", comision);
        
        
        
    } 
}
