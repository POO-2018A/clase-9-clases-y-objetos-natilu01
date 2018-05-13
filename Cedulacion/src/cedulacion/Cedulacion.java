
package cedulacion;
import java.util.Scanner;
import java.lang.*;
import java.io.*;
public class Cedulacion {
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int cedula[]=new int [9];
        int condicion[]=new int [9];
        int resultado[]=new int [9];
        int i,suma;
        
        System.out.println("Este programa sirve para validar su cedula de identidad");
        System.out.println("Ingresesu numero de cedula digito por digito");
        System.out.println();
        for(i=0; i<9; i++){
            System.out.print("digito ["+(i+1)+"]= ");
            cedula[i]=lector.nextInt();
        }
         
        for(i =0; i<9; i++){
            System.out.print("digito ["+(i+1)+"] multiplicar X: ");
            condicion[i]=lector.nextInt();
            resultado[i]=cedula[i]*condicion[i];
        }
        System.out.print("Su cedula es: ");
        for(i=0; i<9; i++){
            System.out.print(cedula[i]+"  ");
        }
        System.out.println();
        System.out.print("             ");
        for (i=0; i<9; i++){
            System.out.print(" ");
            System.out.print("x ");
        }
         
        System.out.println();
        System.out.print("              ");
        for(i=0; i<9; i++){
            System.out.print(condicion[i]+"  ");
        }
         
        System.out.println();
        System.out.print("              ");
        for (i=0; i<9; i++){
            System.out.print("---");
        }
        System.out.println(); 
        System.out.print("Resultado:    ");
        for(i=0; i<9; i++){
            System.out.print(resultado[i]+"  ");
        }
        System.out.println();
        System.out.println("A los nuemeros mayores de 10 se le restara 10-1");
        System.out.println();
        System.out.println("Entonces");
         
        System.out.print("Los Resultados son:  ");
        for(i=0; i<9; i++){
        System.out.print(resultado[i]+"  ");
        if(resultado[0]>10){
            resultado[0]=resultado[0]-9;    
        }else{
        }
        if(resultado[1]>10){
            resultado[1]=resultado[1]-9;
        }else{
        }
        if(resultado[2]>10){
            resultado[2]=resultado[2]-9;
        }else{
        }
        if(resultado[3]>10){
            resultado[3]=resultado[3]-9;
        }else{
        }
        if(resultado[4]>10){
            resultado[4]=resultado[4]-9;
        }else{
        }
        if(resultado[5]>10){
            resultado[5]=resultado[5]-9;
        }else{
        }
        if(resultado[6]>10){
            resultado[6]=resultado[6]-9;
        }else{
        }
        if(resultado[7]>10){
            resultado[7]=resultado[7]-9;
        }else{
        }
        if(resultado[8]>10){
            resultado[8]=resultado[8]-9;
        }else{
        }
    }
        System.out.println();
        suma = resultado[0]+resultado[1]+resultado[2]+resultado[3]+
                resultado[4]+resultado[5]+resultado[6]+resultado[7]+
                resultado[8];
        System.out.println("La suma es: "+suma);
        System.out.println();
         
    }
     
}