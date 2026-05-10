public class rev_no_tri {
    public static void main(String[] args) {
        final int n=4;
        for (int i=1; i<=n; i++) {
            //print spaces
            for (int j=1; j<i; j++) {
                System.out.print(" ");
            }
            //print number
            for (int j=i; j<=n; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
