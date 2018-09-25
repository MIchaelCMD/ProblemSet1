import javax.swing.*;

public class Ex4 {
    public static void main(String[] args) {

      String fullName = JOptionPane.showInputDialog("Enter your full name, including surnames and middle name, if any: ");
      char initial = fullName.charAt(0);

       String surname =  fullName.substring(fullName.lastIndexOf(" "));

      JOptionPane.showMessageDialog(null,"There are " + fullName.length() + " characters in your name.\n" +
              "Your initial is: " + initial + ".\n" +
              "Why not? " + fullName.toUpperCase() + ".\n" +
              "Your surname is: " + surname + ".");

    }
}
