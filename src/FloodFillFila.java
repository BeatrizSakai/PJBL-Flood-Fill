public class FloodFillFila {
    public static void floodFillComFila(int[][] image, int sr, int sc, int newColor) {
        int rows = image.length;
        int cols = image[0].length;
        int originalColor = image[sr][sc];
        if (originalColor == newColor) return;

        Fila<int[]> fila = new Fila<>();
        fila.enfileirar(new int[]{sr, sc});

        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        while (!fila.isEmpty()) {
            int[] curr = fila.desenfileirar();
            int row = curr[0];
            int col = curr[1];

            image[row][col] = newColor;

            for (int[] dir : directions) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];
                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols &&
                    image[newRow][newCol] == originalColor) {
                    fila.enfileirar(new int[]{newRow, newCol});
                }
            }
        }
    }
}
