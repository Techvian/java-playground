public class rhombus {
    public static void main(String[] args) {
        final int n=5;
        for (int i=1; i<=n; i++) {
            //spaces
            for (int j=1; j<=i-1; j++) {
                System.out.print(" ");
            }
            //stars
            for (int k=1; k<=i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
