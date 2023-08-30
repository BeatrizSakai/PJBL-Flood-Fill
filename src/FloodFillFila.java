public class FloodFillFila {
    public static void floodFillComFila(int[][] image, int li, int ci, int novaCor) {
        int linhas = image.length;
        int colunas = image[0].length;
        int corOriginal = image[li][ci];
        if (corOriginal == novaCor) return;

        Fila<int[]> fila = new Fila<>();
        fila.enfileirar(new int[]{li, ci});

        int[][] direcao = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        while (!fila.isEmpty()) {
            int[] atual = fila.desenfileirar();
            int linha = atual[0];
            int coluna = atual[1];

            image[linha][coluna] = novaCor;

            for (int[] dir : direcao) {
                int linhaNova = linha + dir[0];
                int colunaNova = coluna + dir[1];
                if (linhaNova >= 0 && linhaNova < linhas && colunaNova >= 0 && colunaNova < colunas &&
                    image[linhaNova][colunaNova] == corOriginal) {
                    fila.enfileirar(new int[]{linhaNova, colunaNova});
                }
            }
        }
    }
}
