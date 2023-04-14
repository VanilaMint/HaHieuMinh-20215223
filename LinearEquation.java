import javax.swing.JOptionPane;

public class LinearEquation {
   public static void main(String[] args) {
      String inputA = JOptionPane.showInputDialog("Enter the value of a:");
      double a = Double.parseDouble(inputA);
      String inputB = JOptionPane.showInputDialog("Enter the value of b:");
      double b = Double.parseDouble(inputB);
      if (a == 0) {
         if (b == 0) {
            String message = "Any value of x is a solution";
            JOptionPane.showMessageDialog(null, message);
         } else {
            String message = "No solution";
            JOptionPane.showMessageDialog(null, message);
         }
      } else {
         double x = -b / a;
         String message = "The solution is x = " + x;
         JOptionPane.showMessageDialog(null, message);
      }
   }
}
