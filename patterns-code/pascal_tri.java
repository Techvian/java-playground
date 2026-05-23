public class pascal_tri {
    public static void main(String[] args) {
        final int n=4;
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //star
            int m=1;
            for (int j=1; j<=i; j++) {
                System.out.print(m + "  ");

                if (j<i) {
                    m = m*(i-j)/j;
                }
            }
            System.out.println();
        }
    }
}
