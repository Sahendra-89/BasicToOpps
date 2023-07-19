public class function {
    public static void multiplicationFunction(String args[]) {

    }

    public static void multiply(String args[]) {
    }

    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void add(String[] args) {

    }

    public static void multiplicationFunction(int a, int b) {

        a = 3;
        b = 5;
        int prod = multiply(a, b);
        System.out.println("a*b= " + prod);

    }

    // calculate sum of three number overloading
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String args[]) {
        System.out.println(sum(3, 5));
        System.out.println(sum(3, 5, 6));

    }
}
