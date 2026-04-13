/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade.de.vetor.pkg02;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 326136853
 */
public class AtividadeDeVetor02 {

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

        // Lê vetor X
        System.out.println("Digite os " + n + " elementos do vetor X:");
        for (int i = 0; i < n; i++) {
            X[i] = sc.nextInt();
        }

        // Lê vetor Y
        System.out.println("Digite os " + n + " elementos do vetor Y:");
        for (int i = 0; i < n; i++) {
            Y[i] = sc.nextInt();
        }

        // Lista dinâmica para armazenar a união sem repetição
        ArrayList<Integer> Z = new ArrayList<>();

        // Adiciona os elementos de X em Z, sem repetir
        for (int i = 0; i < n; i++) {
            if (!Z.contains(X[i])) {
                Z.add(X[i]);
            }
        }

        // Adiciona os elementos de Y em Z, sem repetir
        for (int i = 0; i < n; i++) {
            if (!Z.contains(Y[i])) {
                Z.add(Y[i]);
            }
        }

        // Exibe o vetor Z
        System.out.print("Vetor união Z: ");
        for (int i = 0; i < Z.size(); i++) {
            System.out.print(Z.get(i) + " ");
        }

        sc.close();
    }
    
}
