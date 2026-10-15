public class Array_2D_DeleteRow {
    static void main(String[] args) {
        int[][] a = {{10, 20}, {30, 40}, {50, 60}};
        int deleteRow = 1;
        int[][] b = new int[a.length - 1][2];
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if (i != deleteRow) {
                for (int j = 0; j < 2; j++)
                    b[k][j] = a[i][j];
                k++;
            }
        }

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.println(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
