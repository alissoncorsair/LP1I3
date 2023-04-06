/** 
 * 7. Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
valor matriz e armazenar o resultado na própria matriz, nas posições correspondentes.

 * Alisson de Sousa Vieira - CB3020568 
 * Lucas Gomes dos Santos  - CB3021777
 */
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        double[][] matriz = new double[3][4];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor da linha " + (i + 1) + " e coluna " + (j + 1) + ": ");
                matriz[i][j] = scanner.nextDouble();
            }
        }

        System.out.print("Digite uma constante multiplicativa: ");
        double constante = scanner.nextDouble();

        scanner.close();

        System.out.println("Valores armazenados na matriz: ");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] *= constante;
                System.out.println("Linha " + (i + 1) + " e coluna " + (j + 1) + ": " + matriz[i][j]);
            }
        }
    }
}