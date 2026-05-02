public class hollow_squ {
    public static void main(String[] args) {
        final int n = 4;
        final int m = 5;
        //outer loop
        for (int i=1; i<=n; i++) {
            //inner loop
            for (int j=1; j<=m; j++) {
                //hollow
                if (i==1 || i==n || j==1 || j==m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
