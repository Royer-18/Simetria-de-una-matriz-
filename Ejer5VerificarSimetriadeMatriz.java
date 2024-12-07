/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer5verificarsimetriadematriz;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejer5VerificarSimetriadeMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("ingrese la dimension de la matriz: ");
        int d = teclado.nextInt(); 
        
        int matriz [][] = new int [d][d];
        
        System.out.println("INGRESE LOS ELEMENTOS: ");
        
        for (int i=0;i<d;i++){
            for (int j=0;j<d;j++){
                matriz[i][j]=teclado.nextInt(); 
            }
        }
        
        //mostrar matriz 
        for (int i=0;i<d;i++){
            for (int j=0;j<d;j++){
                System.out.print("["+ matriz[i][j]+"]");
            }
            System.out.println("");
        }
        
        //SIMETRICA?
        int sime = 0;
        int nosi = 0;
        
        for (int i=0;i<d;i++){
            for (int j=0;j<d;j++){
              if (i!=j){
                if (matriz[i][j] == matriz[j][i]){
                    sime++;
                }else{
                    nosi++;
                }
              }
                
            }
        }
        
        if (nosi==0){
            System.out.println("SIMETRICA");
        }else{
            System.out.println("NO SIMETRICA");
        }
        
        
    }
    
}
