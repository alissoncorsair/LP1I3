/** 
 * 3. Entrar via teclado com “N” valores quaisquer. O valor “N” (que representa a quantidade de
números) será digitado, deverá ser positivo, porém menor que vinte. Caso a quantidade não
satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente. Após a
digitação dos “N” valores, exibir:
a. O maior valor;
b. O menor valor;
c. A soma dos valores;
d. A média aritmética dos valores;
e. A porcentagem de valores que são positivos;
f. A porcentagem de valores negativos;
Após exibir os dados, perguntar ao usuário de deseja ou não uma nova execução do
programa. Consistir a resposta no se

 * Alisson de Sousa Vieira - CB3020568 
 * Lucas Gomes dos Santos  - CB3021777
 */
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        boolean repeat = true;
        Scanner scanner = new Scanner(System.in);
        while (repeat) {
            int n = 0;
            double[] valores;
            double maior = 0, menor = 0, soma = 0, media = 0;
            int positivos = 0, negativos = 0;
            double porcentagemPositivos = 0, porcentagemNegativos = 0;

            System.out.print("Digite a quantidade de valores: ");
            n = scanner.nextInt();

            while (n <= 0 || n > 20) {
                System.out.print("Valor inválido!\nDigite novamente: ");
                n = scanner.nextInt();
            }

            valores = new double[n];

            for (int i = 0; i < valores.length; i++) {
                System.out.print("Digite o " + (i + 1) + "º valor: ");
                valores[i] = scanner.nextDouble();
                if (i == 0) {
                    maior = valores[i];
                    menor = valores[i];
                }
                if (valores[i] > maior) {
                    maior = valores[i];
                }
                if (valores[i] < menor) {
                    menor = valores[i];
                }
                if (valores[i] > 0) {
                    positivos++;
                } else {
                    negativos++;
                }
                soma += valores[i];
            }
            media = soma / valores.length;
            porcentagemPositivos = (positivos * 100) / valores.length;
            porcentagemNegativos = (negativos * 100) / valores.length;

            System.out.println("O maior valor é: " + maior);
            System.out.println("O menor valor é: " + menor);
            System.out.println("A soma dos valores é: " + soma);
            System.out.println("A média aritmética dos valores é: " + media);
            System.out.println("A porcentagem de valores positivos é: " + porcentagemPositivos + "%");
            System.out.println("A porcentagem de valores negativos é: " + porcentagemNegativos + "%");

            System.out.print("Deseja executar novamente? (S/N): ");
            String resposta = scanner.next();

            while (!resposta.equalsIgnoreCase("S") && !resposta.equalsIgnoreCase("N")) {
                System.out.println("Resposta inválida!\nDigite novamente: ");
                resposta = scanner.next();
            }

            if (resposta.equalsIgnoreCase("S")) {
                repeat = true;
                System.out.println("Repetindo...");
            } else {
                repeat = false;
                scanner.close();
            }

        }

    }
}