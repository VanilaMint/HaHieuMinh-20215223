import javax.swing.JOptionPane;

public class LinearSystem {
   public static void main(String[] args) {
      String input;
      double a1, b1, c1, a2, b2, c2;
      input = JOptionPane.showInputDialog(null, "Enter the coefficients of the first equation (ax + by = c):\na = ");
      a1 = Double.parseDouble(input);
      input = JOptionPane.showInputDialog(null, "b = ");
      b1 = Double.parseDouble(input);
      input = JOptionPane.showInputDialog(null, "c = ");
      c1 = Double.parseDouble(input);
      input = JOptionPane.showInputDialog(null, "Enter the coefficients of the second equation (ax + by = c):\na = ");
      a2 = Double.parseDouble(input);
      input = JOptionPane.showInputDialog(null, "b = ");
      b2 = Double.parseDouble(input);
      input = JOptionPane.showInputDialog(null, "c = ");
      c2 = Double.parseDouble(input);
      double d = a1 * b2 - a2 * b1;
      if (d == 0) {
         JOptionPane.showMessageDialog(null, "The system has no unique solution.");
      } else {
         double x = (c1 * b2 - c2 * b1) / d;
         double y = (a1 * c2 - a2 * c1) / d;
         JOptionPane.showMessageDialog(null, "The solution is: x = " + x + ", y = " + y);
      }
   }
}
