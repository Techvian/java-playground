public class hollow_rev_tri {
    public static void main(String[] args) {
        final int n=5;
        for (int i=n; i>=1; i--) {
            //space
            for (int j=i; j<n; j++) {
                System.out.print(" ");
            }
            //print stars
            for (int j=1; j<=2*i-1; j++) {
                if (j==1 || j==2*i-1 || i==n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
