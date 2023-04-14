package lab1;

import java.util.Scanner;

public class Triangles {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the height of the triangle: ");
      int height = scanner.nextInt();
      for (int i = 1; i <= height; i++) {
         for(int k = 1; k <= height-i; k++){
            System.out.print(" ");
         }
         for (int j = 1; j <= (i-1)*2+1; j++) {
            System.out.print("*");

         }
         System.out.println();
      }
   }
}