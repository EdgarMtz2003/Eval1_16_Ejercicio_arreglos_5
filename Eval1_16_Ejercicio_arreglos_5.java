/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moviles
 */
public class Eval1_16_Ejercicio_arreglos_5 {
    public static void main(String[]args){
    int[] arregloDatos=new int[10];
        llenar(arregloDatos);
        imprimir(arregloDatos);

        int[] arregloCopia = new int[arregloDatos.length];
        System.out.println("");
        System.out.println("numeros pares: ");
        for (int i = 0; i < arregloDatos.length; i++) {;
            
            if(arregloDatos[i]%2==0){
               
                arregloCopia[i]=arregloDatos[i];
                System.out.print("["+arregloCopia[i]+"]");
             
            }else{
                arregloCopia[i]=arregloDatos[i]*0;
                System.out.print("");
            }             
                    
        }  
         

    }
        
    public static void llenar(int[]arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i]=(int)(Math.random()*100);
           
        }
    }
    
    public static void imprimir(int[]arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("["+arreglo[i]+"]");
            
        }
    }
    
}
