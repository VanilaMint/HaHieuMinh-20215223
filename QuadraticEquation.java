import javax.swing.JOptionPane;
import java.lang.Math;
public class QuadraticEquation {
   public static void main(String[] args) {
      String input;
      input = JOptionPane.showInputDialog(null, "Enter the coefficient a:");
      double a = Double.parseDouble(input);
      input = JOptionPane.showInputDialog(null, "Enter the coefficient b:");
      double b = Double.parseDouble(input);
      input = JOptionPane.showInputDialog(null, "Enter the coefficient c:");
      double c = Double.parseDouble(input);
      double discriminant = Math.pow(b, 2) - 4 * a * c;
      if (discriminant < 0) {
         JOptionPane.showMessageDialog(null, "The equation has no real roots.");
      } else if (discriminant == 0) {
         double root = -b / (2 * a);
         JOptionPane.showMessageDialog(null, "The equation has one root: " + root);
      } else {
         double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
         double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
         JOptionPane.showMessageDialog(null, "The equation has two roots: " + root1 + " and " + root2);
      }
   }
}
