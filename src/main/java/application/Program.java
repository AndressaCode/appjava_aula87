/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Andressa Silva
 */
public class Program {
    
    public static void main(String[] args){
    
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe valor de n: ");
        int n = sc.nextInt();
        double[] vect = new double[n];
        
        for(int i=0; i<n; i++){
            vect[i] =sc.nextDouble();
        }
        
        double sum = 0.0;
        for(int i=0; i<n; i++){
            sum += vect[i];
        }
        System.out.printf("Media dos valores: %.2f ",  sum/3.0);
        sc.close();
    }
}
