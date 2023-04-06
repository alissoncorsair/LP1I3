/** 
 * 9. Entrar com uma matriz de ordem MxN, onde a ordem também será escolhida pelo usuário,
sendo que no máximo 10x10. A matriz não precisa ser quadrática. Após a digitação dos
elementos, calcular e exibir a matriz transposta.

 * Alisson de Sousa Vieira - CB3020568 
 * Lucas Gomes dos Santos  - CB3021777
 */
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        int m = 0;
        int n = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a ordem da matriz: ");
        System.out.print("M: ");
        m = scanner.nextInt();
        System.out.print("N: ");
        n = scanner.nextInt();

        while (m > 10 || n > 10 || m < 1 || n < 1) {
            System.out.println("Erro! O número deve ser maior que 1 e menor que 10.");
            System.out.println("Digite a ordem da matriz: ");
            System.out.print("M: ");
            m = scanner.nextInt();
            System.out.print("N: ");
            n = scanner.nextInt();
        }

        double[][] matriz = new double[m][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor da linha " + (i + 1) + " e coluna " + (j + 1) + ": ");
                matriz[i][j] = scanner.nextDouble();
            }
        }

        scanner.close();

        double[][] matrizTransposta = new double[n][m];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizTransposta[j][i] = matriz[i][j];
            }
        }

        for (int i = 0; i < matrizTransposta.length; i++) {
            String linha = "";
            for (int j = 0; j < matrizTransposta[i].length; j++) {
                linha += matrizTransposta[i][j] + " ";
                if (j >= 0 && j < matrizTransposta[i].length - 1) {
                    linha += " - ";
                }
            }
            System.out.println(linha);
            System.out.print("\n");
        }
    }
}
