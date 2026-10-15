public class Array_2D_insertrow {
    public static void main(String[] args) {
        int[][] a = {{10, 20}, {30, 40}};
        int[][] b = new int[a.length + 1][2];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                b[i][j] = a[i][j];
            }
        }

        System.out.println("Before insertion:");
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        b[2][0] = 50;
        b[2][1] = 60;

        System.out.println("After insertion:");
        for(int i = 0; i < b.length; i++){
            for(int j = 0; j < b[i].length; j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
