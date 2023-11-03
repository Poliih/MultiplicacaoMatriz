
import java.util.Scanner;

public class MMatriz {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nLinhasA, nColunasA, nLinhasB, nColunasB;
        int[][] matrizA, matrizB, matrizC;

        // Get the sizes and elements of matrices A and B
        System.out.println("Informe o número de linhas da matriz A:");
        nLinhasA = scanner.nextInt();
        System.out.println("Informe o número de colunas da matriz A:");
        nColunasA = scanner.nextInt();
        System.out.println("Informe o número de linhas da matriz B:");
        nLinhasB = scanner.nextInt();
        System.out.println("Informe o número de colunas da matriz B:");
        nColunasB = scanner.nextInt();

        // Check if it is possible to multiply matrices
        if (nColunasA != nLinhasB) {
            System.out.println("Não é possível multiplicar as matrizes.");
            System.exit(1);
        }

        matrizA = new int[nLinhasA][nColunasA];
        matrizB = new int[nLinhasB][nColunasB];
        matrizC = new int[nLinhasA][nColunasB];

        for (int i = 0; i < nLinhasA; i++) {
            for (int j = 0; j < nColunasA; j++) {
                System.out.println("Informe o valor do elemento A[" + i + "][" + j + "]:");
                matrizA[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < nLinhasB; i++) {
            for (int j = 0; j < nColunasB; j++) {
                System.out.println("Informe o valor do elemento B[" + i + "][" + j + "]:");
                matrizB[i][j] = scanner.nextInt();
            }
        }

        // Calculate matrix multiplication
        for (int i = 0; i < nLinhasA; i++) {
            for (int j = 0; j < nColunasB; j++) {
                matrizC[i][j] = 0;
                for (int k = 0; k < nColunasA; k++) {
                    matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        // Function to print a matrix
        System.out.println("Matriz A:");
        for (int i = 0; i < nLinhasA; i++) {
            for (int j = 0; j < nColunasA; j++) {
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matriz B:");
        for (int i = 0; i < nLinhasB; i++) {
            for (int j = 0; j < nColunasB; j++) {
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("Matriz C = A x B:");
        for (int i = 0; i < nLinhasA; i++) {
            for (int j = 0; j < nColunasB; j++) {
                System.out.print(matrizC[i][j] + " ");
            }
            System.out.println();
        }
    }
}