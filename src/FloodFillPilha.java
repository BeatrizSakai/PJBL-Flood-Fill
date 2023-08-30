public class FloodFillPilha {
    public static void floodFillComPilha(int[][] image, int li, int ci, int corNova) {
        int linhas = image.length;
        int colunas = image[0].length;
        int corOriginal = image[li][ci];
        if (corOriginal == corNova) return;

        Pilha<int[]> pilha = new Pilha<>();
        pilha.empilhar(new int[]{li, ci});

        int[][] direcao = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        while (!pilha.isEmpty()) {
            int[] atual = pilha.desempilhar();
            int linha = atual[0];
            int coluna = atual[1];

            image[linha][coluna] = corNova;

            for (int[] dir : direcao) {
                int linhaNova = linha + dir[0];
                int colunaNova = coluna + dir[1];
                if (linhaNova >= 0 && linhaNova < linhas && colunaNova >= 0 && colunaNova < colunas &&
                    image[linhaNova][colunaNova] == corOriginal) {
                    pilha.empilhar(new int[]{linhaNova, colunaNova});
                }
            }
        }
    }
}