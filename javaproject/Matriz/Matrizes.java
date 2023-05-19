package Matriz;
public class Matrizes {
    // matriz[0].length = linha
    // matriz[1].length = coluna
    public double[][] atualizar(double[][] mat, int linha, int coluna) {
        mat[linha][coluna] = 0.0;
        return mat;
    }
}
