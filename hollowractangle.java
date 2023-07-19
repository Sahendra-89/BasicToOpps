public class hollowractangle {
    public static void hollow_ractangle(int n) {
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = i; j <= (n - i);) {
                System.out.print(" ");
            }
            // hollow ractngle- star
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        hollow_ractangle(5);
    }

}
