package date;
import java.util.Scanner;

public class DateInYear {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int month, year;
      boolean valid = false;
      String monthName;
      do {
         System.out.print("Enter the month: ");
         monthName = scanner.nextLine();
         System.out.print("Enter the year: ");
         year = scanner.nextInt();

         scanner.nextLine(); 
         month = getMonthNumber(monthName);
         if (month >= 1 && month <= 12 && year >= 0) {
            valid = true;
         } else {
            System.out.println("Invalid month/year. Please try again.");
         }
      } while (!valid);
      int days = getDaysInMonth(month, year);
      System.out.println("The number of days in " + monthName + " " + year + " is " + days + ".");
      scanner.close();
   }
   
   public static int getDaysInMonth(int month, int year) {
      int days;
      switch (month) {
         case 2:
            if (isLeapYear(year)) {
               days = 29;
            } else {
               days = 28;
            }
            break;
         case 4:
         case 6:
         case 9:
         case 11:
            days = 30;
            break;
         default:
            days = 31;
      }
      return days;
   }
   
   public static boolean isLeapYear(int year) {
      if (year % 4 == 0) {
         if (year % 100 == 0) {
            if (year % 400 == 0) {
               return true;
            } else {
               return false;
            }
         } else {
            return true;
         }
      } else {
         return false;
      }
   }
   
   public static int getMonthNumber(String monthName) {
      monthName = monthName.toLowerCase().trim();
      switch (monthName) {
         case "january":
         case "jan":
         case "1":
            return 1;
         case "february":
         case "feb":
         case "2":
            return 2;
         case "march":
         case "mar":
         case "3":
            return 3;
         case "april":
         case "apr":
         case "4":
            return 4;
         case "may":
         case "5":
            return 5;
         case "june":
         case "jun":
         case "6":
            return 6;
         case "july":
         case "jul":
         case "7":
            return 7;
         case "august":
         case "aug":
         case "8":
            return 8;
         case "september":
         case "sep":
         case "9":
            return 9;
         case "october":
         case "oct":
         case "10":
            return 10;
         case "november":
         case "nov":
         case "11":
            return 11;
         case "december":
         case "dec":
         case "12":
            return 12;
         default:
            return -1;
      }
   }
}
