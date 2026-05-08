public class no_triangular {
    public static void main(String[] args) {
        final int n=4;
        //outer loop
        for (int i=1; i<=n; i++) {
            //spaces
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
