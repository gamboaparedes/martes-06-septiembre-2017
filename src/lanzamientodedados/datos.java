/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanzamientodedados;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author gamboa
 */
public class datos {
      //-------DADOS---------------
    public void dados(){
        Random r1 = new Random();
        int d1 = r1.nextInt(6)+1;
        int d2 = r1.nextInt(6)+1;
        int d3 = r1.nextInt(6)+1;
        
        System.out.println("Dado numero 1 : "+d1);
        System.out.println("Dado numero 2 : "+d2);
        System.out.println("Dado numero 3 : "+d3);
        
     if(d1==6&&d2==6&&d3==6){
    System.out.println("El Resultado de dado 1 " + d1 + " Es EXCELENTE");
    }  
   else if(d1==6&&d2==6||d3==6&&d3==6||d2==6&&d1==6||d2==6&&d3==6){
    System.out.println("Muy bien");
    }  
   else if(d1==6||d2==6||d3==6){
    System.out.println("Regular");
    }  
   else{
    System.out.println("Pesimo");
    }
    }
       //-------5 INTENTOS---------------
     public void multiplicacion()
    {
         Scanner leer = new Scanner(System.in);
        Random r2 = new Random();
        int intentos=0;
        int maximos=5;
        int multi1 = r2.nextInt(10)+1;
        int multi2 = r2.nextInt(10)+1;
        
         int resultado1 = multi1*multi2;
         System.out.println("Sola mente tienes 5 intentos");
         System.out.println(+multi1+"*"+multi2+"=");
    do{ 
          int resultado2 = leer.nextInt();
         if(resultado2 == resultado1){
        System.out.println("Tu respuesta es correcta");
        maximos=0;
         }else{
             intentos++;
         System.out.println("Tu respuesta es incorrecta tienes " +intentos+ "/5 Intentos");
         }
    }while(intentos<maximos);        
}
     //-------MENORES DE 20--------------
     public void numericos()
    {
        Scanner teclado=new Scanner(System.in);
        int suma=0,valor,total=0,pares=0, i=0;
            System.out.print("Ingrese valor:");
            valor=teclado.nextInt();
            
           while(valor<5){
               
               if (valor%2==0){
            System.out.println("El número es par");
            i++;
            }
            if(valor>20){
                 suma=suma+valor;
            
            }else{ System.out.println("El numero tiene que ser mayor a 20");     
            }
         }
          total=suma;
          System.out.print("La suma es:");
          System.out.println(total);
 }
      //-------PIRAMIDES--------------
      public void piramide()
    {
           int num1=5;
        for (int i=1;i<=num1;i++){  
            for(int j=1;j<=i;j++){
        System.out.print("*");
            }
            System.out.println();
        }
         int num=5;
        for (int i=num;i>=1;i--){
          
            for(int j=1;j<=i;j++){
        System.out.print("*");
            }
            System.out.println();
        }

    }
      public void juego(){
         Scanner leer = new Scanner(System.in);
        Random r2 = new Random();
     
        int numero = r2.nextInt(100)+1;
        int adivinar = r2.nextInt();
        while(numero !=adivinar){
            if(adivinar<numero){ 
           System.out.println("Ingresa un numero mayor");
            }else{           
           System.out.println("Ingresa un numero menor");
            }
            adivinar= leer.nextInt();
        }
           System.out.println("adivinaste");
    }
       public void tarjeta(){
        
        double interes = 0.15;
        double deuda = 6000 ;
        int total=0;
        int mes=0;
        
         while(deuda<=55000){ 
             
         deuda= deuda+(deuda*interes);
        mes++;
        
        DecimalFormat df = new DecimalFormat("#.00"); 
        System.out.println("Mes "+mes+ ":"+df.format(deuda));
    }
            
       
       }
}
