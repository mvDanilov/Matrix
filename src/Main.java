public class Main {

    public static void main(String[] args) {
        int[][] m = {{1, 2, 4, 3}, {5, 1, 3, 6, 5}};
        int[][] x = {{1, 1, 1, 1}, {7, 8, 6, 3}, {6, 3, 7, 9}};

        int n = m.length;
        int y = m[0].length;
        int q = x.length;
        int[][] row = new int[y][q];

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < q; j++) {
                for (int k = 0; k < n; k++) {
                    row[i][j] = m[k][i] * x[j][k];
                }
            }
        }

        for (int i = 0; i < row.length; i++) {
            for (int j = 0; j < row[0].length; j++) {
                System.out.print(row[i][j] + "   ");
            }

            System.out.println();
        }
    }
}