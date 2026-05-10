/* 
        *       i=1 space=4 star=1
       * *      i=2 space=3 star=3
      *   *     i=3 space=2 star=5
     *     *    i=4 space=1 star=7
    * * * * *   i=5 space=0 star=9 
*/
public class hollow_tri {
    public static void main(String[] args) {
        final int n=5;
        //outer loop
        for (int i=1; i<=n; i++) {
            //inner loop
            //for spaces
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
