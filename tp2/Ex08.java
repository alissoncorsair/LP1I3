/** 
 * 8. Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
valor matriz e armazenar o resultado em outra matriz de mesma ordem, nas posições
correspondentes. Exibir as matrizes na tela, sob a forma matricial, ou seja, linhas por
colunas.

 * Alisson de Sousa Vieira - CB3020568 
 * Lucas Gomes dos Santos  - CB3021777
 */
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        double[][] matriz = new double[3][4];
        double[][] matriz2 = new double[3][4];
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

        System.out.println("Valores armazenados na matriz: \n");

        for (int i = 0; i < matriz2.length; i++) {
            String linha = "";
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = matriz[i][j] * constante;
                linha += matriz2[i][j] + " ";
                if (j >= 0 && j < 3) {
                    linha += " - ";
                }
            }
            System.out.println(linha);
            System.out.print("\n");
        }
    }
}