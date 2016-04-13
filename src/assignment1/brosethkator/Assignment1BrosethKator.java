/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1.brosethkator;

/**
 *
 * @author Broseth
 */
import java.util.Scanner;

public class Assignment1BrosethKator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number of pattern you want: ");
        int n = input.nextInt();   
        displayPattern(n);
        System.out.print("Please enter number of pattern's lines you want(sentinel value): ");
        int M = input.nextInt();
        displayPattern2(M);
            
}
    
public static void displayPattern (int n){
    int i, j, k;
    for (i = 1; i <= n; i++){
        for (j = i; j < n; j++){
            System.out.print("      ");
        }
    for (k = i; k > 0; k--) {
        System.out.printf("%6d",k);
    }
    System.out.println();
    }
}

public static void displayPattern2 (int M){
    int a, b, c, d = 1;
    for(a = 1; a <= M ; a++){
        for (b = a; b < M; b++){
            System.out.print("      ");
        }
    for(c = d; c < d+a; c++){
        System.out.printf("%6d", c);
        }
    d+=a;
    System.out.println();
    }    
}
}