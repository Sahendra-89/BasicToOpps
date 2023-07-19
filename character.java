public class character {
    public static void main(String args[]) {
        int n = 6;
        char Ch = 'A';
        // outer loop
        for (int line = 1; line <= n; line++) {
            // innar loop
            for (int chars = 1; chars <= line; chars++) {

                System.out.print(Ch);
                Ch++;
            }

            System.out.println();

        }

    }
}
