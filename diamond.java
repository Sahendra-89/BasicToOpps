public class diamond {

    public static void Diamond(int n) {
        // first half
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // star print karna hai
            for (int j = 1; j <= 2 * (i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        // 2nd half print
        for (int i = n; i >= 1; i--) {
            // space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // star print karna hai
            for (int j = 1; j <= 2 * (i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void main(String args[]) {
        Diamond(10);
    }

}
