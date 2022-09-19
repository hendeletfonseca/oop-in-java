package application;

import java.util.Scanner;

public class ExerciseMatriz {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int [][]matriz = new int[m][n];

        for (int[] line : matriz){
            for (int i = 0; i < n; i++){
                line[i] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (matriz[i][j] == x){
                    System.out.println("Posições: ");
                    if (j > 0) System.out.println("Esquerda: " + matriz[i][j - 1]);
                    if (j < (n - 1)) System.out.println("Direita: " + matriz[i][j + 1]);
                    if (i < (m - 1)) System.out.println("Abaixo: " + matriz[i + 1][j]);
                    if (i > 0) System.out.println("Acima: " + matriz[i - 1][j]);
                    System.out.println("-------------------------------------");
                }
            }
        }

    }
}
