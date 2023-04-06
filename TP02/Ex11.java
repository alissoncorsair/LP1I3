import java.util.Scanner;

import org.apache.commons.math3.linear.LUDecomposition;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

/*
11. Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário,
sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos,
calcular e exibir determinante da matriz.

    Para compilar esse programa, devemos utilizar o pacote commons-math3-3.6.1.jar, presente na pasta /lib:
    javac -cp lib/commons-math3-3.6.1.jar Ex10.java

    Para executar..
    java -cp .:lib/commons-math3-3.6.1.jar Ex10

 * Alisson de Sousa Vieira - CB3020568 
 * Lucas Gomes dos Santos  - CB3021777
 */
public class Ex11 {
    public static void main(String[] args) {
        int m;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a ordem da matriz quadrática: ");
        System.out.print("M: ");
        m = scanner.nextInt();

        while (m > 10 || m < 1) {
            System.out.println("Erro! O número deve ser maior que 1 e menor que 10.");
            System.out.println("Digite a ordem da matriz: ");
            System.out.print("M: ");
            m = scanner.nextInt();
        }

        double[][] matriz = new double[m][m];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor da linha " + (i + 1) + " e coluna " + (j + 1) + ": ");
                matriz[i][j] = scanner.nextDouble();
            }
        }

        scanner.close();

        System.out.println("Matriz digitada: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int determinante = 0;

        RealMatrix matrizReal = MatrixUtils.createRealMatrix(matriz);
        LUDecomposition lu = new LUDecomposition(matrizReal);
        determinante = (int) lu.getDeterminant();

        System.out.println("Determinante da matriz: " + determinante);
    }
}
