public class py_reverse_left {
    public static void main(String[] args) {
        final int n=5;
        //outer loop
        for (int i=n; i>=1; i--) {
            //print spaces
            for (int j=n; j>i; j--) {
                System.out.print(" ");
            }
            //print stars
            for (int k=1; k<=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
