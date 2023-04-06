/** 
 * 5. Armazenar seis valores em uma matriz de ordem 3x2. Apresentar os valores na tela.
 * 
 * Alisson de Sousa Vieira - CB3020568 
 * Lucas Gomes dos Santos  - CB3021777
 */
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        double[][] matriz = new double[3][2];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor da linha " + (i + 1) + " e coluna " + (j + 1) + ": ");
                matriz[i][j] = scanner.nextDouble();
            }
        }

        scanner.close();

        System.out.println("Valores armazenados na matriz: ");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Linha " + (i + 1) + " e coluna " + (j + 1) + ": " + matriz[i][j]);
            }
        }
    }
}