public class no_increaing_rev_pyr {
    public static void main(String[] args) {
        final int n=4;
        for (int i=1; i<=n; i++) {
            for (int j=1; j>=i; i++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
