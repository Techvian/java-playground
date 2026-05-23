public class right_pascal_tri {
    public static void main(String[] args) {
        final int n=4;
        for (int i=1; i<=n; i++) {
            for (int j=n; j<=i-1; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
