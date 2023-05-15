package array;

import java.util.Arrays;

public class ArraySort {
   public static void main(String[] args) {
      int[] numbers = {5, 2, 8, 4, 9, 1, 3, 7, 6};
      Arrays.sort(numbers);
      System.out.println("Sorted array: " + Arrays.toString(numbers));
      int sum = 0;
      for (int i = 0; i < numbers.length; i++) {
         sum += numbers[i];
      }
      double average = (double) sum / numbers.length;
      System.out.println("Sum of array elements: " + sum);
      System.out.println("Average value of array elements: " + average);
   }
}
