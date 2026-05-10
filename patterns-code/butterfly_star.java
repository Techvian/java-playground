public class butterfly_star {
    public static void main(String[] args) {
        final int n=4;
        //outer loop -->upper part
        for (int i=1; i<=n; i++) {
            //stars
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            //spaces
            for (int j=1; j<=(2*(n-i)); j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //lower part
        for (int i=n; i>=1; i--) {
            //stars
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            //spaces
            for (int j=1; j<=(2*(n-i)); j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
