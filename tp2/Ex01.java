
/** 
 * 1. Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro.
Caso contrário solicitar novamente apenas o segundo valor.

 * Alisson de Sousa Vieira - CB3020568 
 * Lucas Gomes dos Santos  - CB3021777
 */
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        double[] nums = new double[2];
        nums = getInput(scanner, num1, num2, nums);

        while (nums[0] >= nums[1]) {
            System.out.println("\n\nO segundo número deve ser maior que o segundo!");
            nums = getInput(scanner, num1, num2, nums);
        }
    }

    public static double[] getInput(Scanner scanner, double num1, double num2, double[] nums) {

        System.out.print("Digite o primeiro número: ");
        nums[0] = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        nums[1] = scanner.nextDouble();

        return nums;
    }
}