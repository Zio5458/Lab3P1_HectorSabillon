/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_hectorsabillon;
import java.util.Scanner;
/**
 *
 * @author hdann
 */
public class Lab3P1_HectorSabillon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int ejercicio;
        System.out.println("1 <- Diptongo");
        System.out.println("2 <- Pi");
        System.out.println("3 <- Time Clock");
        System.out.println("4 <- Salida");
        System.out.println("Ingrese el numero del ejercicio a visualizar: ");
        ejercicio = leer.nextInt();
        switch (ejercicio){
            case 1 -> {
                String palabra;
                System.out.println("Ingrese una palabra: ");
                palabra = leer.next() .toLowerCase();
                int cont = 0;
                for (int i = 0; i < palabra.length(); i++){
                    char char1 = palabra.charAt(i);
                    switch (char1){
                        case 'a', 'e', 'i', 'o', 'u' -> {
                            char char2;
                            if ((i + 1) != palabra.length()){
                            char2 = palabra.charAt(i+1);
                            } else {
                                char2 = 'y';
                            }
                            switch (char2){
                                case 'a', 'e', 'i', 'o', 'u' -> {
                                    cont++;
                                }
                            
                    }
                }
                }
            }
                if (cont > 0){
                    System.out.println(palabra + " es diptongo");
                } else {
                    System.out.println(palabra + " no es diptongo");
                }
            }
            case 2 -> {
                int limite;
                double sumatoria, num1, num2, acum = 0;
                do{
                System.out.println("Ingrese el limite: ");
                limite = leer.nextInt();
                if (limite > 0){
                for (int i = 0; i < limite; i++){
                    num1 = Math.pow(-1, i);
                    num2 = (2 * i) + 1;
                    sumatoria = num1 / num2;
                    acum += sumatoria;
                }
                
                acum *= 4;
                System.out.println("El resultado de la sumatoria es: " + acum);
                } else {
                    System.out.println("El numero ingresado debe ser mayor que 0");
                }
                }while (limite < 0);
            }
            case 3 -> {
                int num;
                do{
                    System.out.println("Ingrese un numero impar: ");
                    num = leer.nextInt();
                    if (num % 2 == 0){
                        System.out.println("El numero ingresado no puede ser par");
                    } else {
                        for (int i = 0; i < num/2; i++){
                            for (int j = 0; j < i; j++){
                                System.out.print(" ");
                            }
                            for (int k = 0; k < num - (2 * i); k++){
                                System.out.print("*");
                            }
                            System.out.println();
                            
                        }
                        int n = (num/2) + 1;
                        for (int i = 0; i < n; i++){
                            for (int j = 0; j < n - (i+1); j++){
                                System.out.print(" ");
                            }
                            for (int k = 0; k <= i + i; k++){
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        
                    }
                } while (num % 2 == 0);
            }
                
        }
    }
    
}
