
/** 
 * 10. Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário,
sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos, calcular e exibir a matriz inversa. Exibir as matrizes na tela, sob a forma matricial (linhas x
colunas).

    Para compilar esse programa, devemos utilizar o pacote commons-math3-3.6.1.jar, presente na pasta /lib:
    javac -cp lib/commons-math3-3.6.1.jar Ex10.java

    Para executar..
    java -cp .:lib/commons-math3-3.6.1.jar Ex10


 * Alisson de Sousa Vieira - CB3020568 
 * Lucas Gomes dos Santos  - CB3021777
 */
import java.util.Scanner;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.LUDecomposition;

public class Ex10 {
    public static void main(String[] args) {
        int m = 0;
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
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        RealMatrix realMatrix = MatrixUtils.createRealMatrix(matriz);
        RealMatrix inverseMatrix = new LUDecomposition(realMatrix).getSolver().getInverse();
        double[][] matrizInversa = inverseMatrix.getData();

        System.out.println("Matriz inversa: ");
        for (int i = 0; i < matrizInversa.length; i++) {
            for (int j = 0; j < matrizInversa[i].length; j++) {
                System.out.print(matrizInversa[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double[][] inversa(double[][] matriz) {
        int n = matriz.length;
        double[][] identidade = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                identidade[i][j] = (i == j) ? 1 : 0;
            }
        }

        for (int j = 0; j < n; j++) {
            double pivo = matriz[j][j];

            for (int k = 0; k < n; k++) {
                matriz[j][k] /= pivo;
                identidade[j][k] /= pivo;
            }

            for (int i = 0; i < n; i++) {
                if (i != j) {
                    double fator = matriz[i][j];
                    for (int k = 0; k < n; k++) {
                        matriz[i][k] -= fator * matriz[j][k];
                        identidade[i][k] -= fator * identidade[j][k];
                    }
                }
            }
        }

        return identidade;
    }
}
