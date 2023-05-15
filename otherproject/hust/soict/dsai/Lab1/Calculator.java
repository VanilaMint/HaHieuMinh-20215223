import javax.swing.JOptionPane;

public class Calculator {
   public static void main(String[] args) {

      String input1 = JOptionPane.showInputDialog("Enter the first number:");
      double num1 = Double.parseDouble(input1);

      String input2 = JOptionPane.showInputDialog("Enter the second number:");
      double num2 = Double.parseDouble(input2);

      double sum = num1 + num2;
      double diff = num1 - num2;
      double product = num1 * num2;
      double quotient = num1 / num2;

      String message = "Sum: " + sum + "\n"
                     + "Difference: " + diff + "\n"
                     + "Product: " + product + "\n"
                     + "Quotient: " + quotient + "\n";
      JOptionPane.showMessageDialog(null, message);
   }
}
