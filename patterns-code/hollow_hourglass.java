public class hollow_hourglass {
    public static void main(String[] args) {
        final int n=4;
        for (int i=n; i>=1; i--) {
            for (int j=i; j<n; j++) {
                System.out.print(" ");
            }
            //print stars
            for (int j=1; j<=2*i-1; j++) {
                if (i==n || j==2*i-1 || j==1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //lower part
        for (int i=2; i<=n; i++) {
            for (int j=i; j<n; j++) {
                System.out.print(" ");
            }
            //print stars
            for (int j=1; j<=2*i-1; j++) {
                if (i==n || j==2*i-1 || j==1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
