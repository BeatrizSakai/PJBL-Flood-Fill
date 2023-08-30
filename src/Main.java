public class Main {
    public static void main(String[] args) {
        int[][] image = {
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
            {1, 1, 1, 1, 1, 1, 1, 1, 0, 1},
            {1, 1, 1, 1, 1, 1, 1, 0, 1, 1},
            {1, 1, 1, 1, 1, 1, 0, 1, 1, 1},
            {1, 1, 1, 1, 1, 0, 1, 1, 1, 1},
            {1, 1, 1, 1, 0, 1, 1, 1, 1, 1},
            {1, 1, 1, 0, 1, 1, 1, 1, 1, 1},
            {1, 1, 0, 1, 1, 1, 1, 1, 1, 1},
            {1, 0, 1, 1, 1, 1, 1, 1, 1, 1},
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 1}};

        System.out.println("Imagem original:");
            for (int[] linha : image) {
                for (int pixel : linha) {
                    System.out.print(pixel + " ");
                }
                System.out.println();
            }

        int linhaInicial = 0;
        int colunaInicial = 0;
        int novaCor = 2;

        FloodFillPilha.floodFillComPilha(image, linhaInicial, colunaInicial, novaCor);
        System.out.println("Pilha:");
        for (int[] linha : image) {
            for (int pixel : linha) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
        
        FloodFillFila.floodFillComFila(image, linhaInicial, colunaInicial, novaCor);
        System.out.println("Fila:");
        for (int[] linha : image) {
            for (int pixel : linha) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
    }
}
