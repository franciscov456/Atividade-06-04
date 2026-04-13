/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade.de.vetor.pkg01;
import java.util.Scanner;
/**
 *
 * @author 326136853
 */
public class AtividadeDeVetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);

        // Lê o valor de n
        System.out.print("Digite o valor de n: ");
        int n = sc.nextInt();

        int[] X = new int[n];
        int[] Y = new int[n];

        // Lê os elementos do vetor X
        System.out.println("Digite os " + n + " elementos do vetor:");
        for (int i = 0; i < n; i++) {
            X[i] = sc.nextInt();
        }

        // Gera o vetor Y invertido
        for (int i = 0; i < n; i++) {
            Y[i] = X[n - 1 - i];
        }

        // Mostra o vetor Y
        System.out.print("Vetor Y invertido: ");
        for (int i = 0; i < n; i++) {
            System.out.print(Y[i] + " ");
        }

        sc.close();
    }
    
}
