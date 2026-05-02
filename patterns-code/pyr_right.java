public class pyr_right {
    public static void main(String[] args) {
        final int n = 4;
        //outer loop
        for (int i=1; i<=n; i++) {
            //outer loop
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
