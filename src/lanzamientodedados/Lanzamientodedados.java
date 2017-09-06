/*
EJERCICIO 1
 */
package lanzamientodedados;


import java.util.Random;
import java.util.Scanner;

public class Lanzamientodedados {

    public static void main(String[] args) {
        
       Scanner leer = new Scanner(System.in);
       datos operacion = new datos();
       System.out.println("1.Dados");  
       System.out.println("2.Numeros mayores que 20");  
       System.out.println("3.Multiplicacion aleatoria"); 
       System.out.println("4.piramide"); 
        System.out.println("5.juego"); 
          System.out.println("6.tarjeta");
      int op = leer.nextInt();
      switch(op){
          case 1:{
           operacion.dados(); 
          break;
          }
          case 2:{ 
           operacion.numericos();
          break;
          }
          case 3:{
           operacion.multiplicacion();
          break;
          }
           case 4:{
           operacion.piramide();
          break;
          }
          case 5:{
           operacion.juego();
          break;
          }
          case 6:{
           operacion.tarjeta();
          break;
          }
      }
    }
}

