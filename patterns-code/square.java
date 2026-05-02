public class square {
    public static void main(String[] args) {
        final int n = 4;
        final int m = 5;
        //outer loop
        for (int i=1; i<=n; i++) {
            //inner loop
            for (int j=1; j<=m; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
