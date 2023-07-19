
public class largestarray {
   public static int getlargestArray(int numbers[]) {

      int largest = Integer.MIN_VALUE;
      int Smallest = Integer.MIN_VALUE;
      // -infinity identify minimum value karta hai.
      for (int i = 0; i <= numbers.length; i++) {
         if (largest < numbers[i]) {
            largest = numbers[i];

         }
         if (Smallest > numbers[i]) {
            Smallest = numbers[i];

         }

      }
      System.out.println("Smallest value is:" + getlargestArray(numbers));
      return largest;

   }

   public static void main(String args[]) {
      int numbers[] = { 1, 2, 6, 3, 5 };
      System.out.println("getlargest value is:" + getlargestArray(numbers));
   }

}
