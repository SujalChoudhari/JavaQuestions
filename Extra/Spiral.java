public class Spiral {
    public static void main(String[] args) {
        int n = 5;
        int number = 1;

        int[][] grid = new int[n][n];

        int maxX = n - 1, maxY = n - 1;
        int minX = 0, minY = 0;

        while (maxX >= minX && maxY >= minY) { // there is still possiblility,
            // top row
            for (int i = minX; i <= maxX; i++) {
                grid[minY][i] = number++;
            }
            minY++; // now min y is shifted down

            // right column
            for (int i = minY; i <= maxY; i++) {
                grid[i][maxX] = number++;
            }

            maxX--; // now max x is shifted left

            // bottom row
            for (int i = maxX; i >= minX; i--) {
                grid[maxY][i] = number++;
            }

            maxY--; // now max y is shifted up

            // left column
            for (int i = maxY; i >= minY; i--) {
                grid[i][minX] = number++;
            }

            minX++; // now min x is shifted right

        }

        // print the grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%-3d",grid[i][j]);
            }
            System.out.println();
        }
    }
}
