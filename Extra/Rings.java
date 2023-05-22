public class Rings {
    public static void main(String[] args) {

        int n = 5;
        int[][] grid = new int[n][n];

        int centerX = 2, centerY = 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = distance(i, j, centerX, centerY);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static int distance(int x1, int y1, int x2, int y2) {
        return (int) Math.pow(
                Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2),
                0.5f);
    }
}