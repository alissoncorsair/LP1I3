/** 
 * 2. Entrar via teclado com dez valores positivos. Consistir a digitação e enviar mensagem de
erro, se necessário. Após a digitação, exibir:
a. O maior valor;
b. A soma dos valores;
c. A média aritmética dos valores.

 * Alisson de Sousa Vieira - CB3020568 
 * Lucas Gomes dos Santos  - CB3021777
 */
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        double[] valores = new double[10];
        Scanner scanner = new Scanner(System.in);
        double maior = 0, soma = 0, media = 0;
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            valores[i] = scanner.nextDouble();
            while (valores[i] < 0) {
                System.out.print("Valor inválido!\nDigite novamente: ");
                valores[i] = scanner.nextDouble();
            }
            if (i == 0) {
                maior = valores[i];
            }
            if (valores[i] > maior) {
                maior = valores[i];
            }
            soma += valores[i];
        }
        scanner.close();

        media = soma / valores.length;

        System.out.println("O maior valor é: " + maior);
        System.out.println("A soma dos valores é: " + soma);
        System.out.println("A média aritmética dos valores é: " + media);

    }
}