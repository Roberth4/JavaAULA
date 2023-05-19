package Matriz;
import java.util.Scanner;

public class MatrizesTeste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Matrizes teste = new Matrizes();

        double matriz[] [] = new double [2][2];

        for (int i = 0; i < matriz[0].length; i++){
            for (int j = 0; j < matriz[1].length; j++)  {
                System.out.printf("Digite o valor da linha %d coluna %d: ", i, j);
                matriz[i][j] = input.nextDouble();
            }        
            System.out.println();
        }   

        matriz=teste.atualizar(matriz, 0, 1);
        System.out.println("Imprimindo Matriz atualizada");
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz[1].length; j++) {
                System.out.printf("%f ", matriz[i][j]);
            }
            System.out.println();
        }
        input.close();
    }
}
