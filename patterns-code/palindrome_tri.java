public class palindrome_tri {
    public static void main(String[] args) {
        final int n=4;
        //outer loop
        for (int i=1; i<=n; i++) {
            //spaces
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //print right side
            for (int j=i; j>=1; j--) {
                System.out.print(j);
            }
            //print left side
            for (int j=2; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
