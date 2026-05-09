public class zero_one_tri {

    public static void main(String[] args) {
        final int n=4;
        //outer loop
        for (int i=1; i<=n; i++) {
            //inner loop
            for (int j=1; j<=i; j++) {
                //find even or odd
                if ((i+j)%2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
