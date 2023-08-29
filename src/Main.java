public class Main {
    public static void main(String[] args) {
        int[][] image = {
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 0, 1},
            {1, 1, 1, 1, 1, 1, 1, 0, 1, 1},
            {1, 1, 1, 1, 1, 1, 0, 1, 1, 1},
            {1, 1, 1, 1, 1, 0, 1, 1, 1, 1},
            {1, 1, 1, 1, 0, 1, 1, 1, 1, 1},
            {1, 1, 1, 0, 1, 1, 1, 1, 1, 1},
            {1, 1, 0, 1, 1, 1, 1, 1, 1, 1},
            {1, 0, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};

        System.out.println("Imagem original:");
            for (int[] row : image) {
                for (int pixel : row) {
                    System.out.print(pixel + " ");
                }
                System.out.println();
            }

        int startRow = 0;
        int startCol = 0;
        int newColor = 2;

        FloodFillPilha.floodFillComPilha(image, startRow, startCol, newColor);
        System.out.println("Pilha:");
        for (int[] row : image) {
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
        
        FloodFillFila.floodFillComFila(image, startRow, startCol, newColor);
        System.out.println("Fila:");
        for (int[] row : image) {
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
    }
}
