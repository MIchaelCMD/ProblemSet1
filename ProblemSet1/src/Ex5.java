import javax.swing.*;

public class Ex5 {
    public static void main(String[] args) {

        int b = 6, c = -16, a = 1;
        double x1, x2;
        String x;


        x1 = (-b + (Math.sqrt((b * b)) - (4 * a * c)) / (2 * a));

        x2 = (-b - Math.sqrt((b * b) - (4 * a * c)) / (2 * a));

        x = x1 + "\n " + x2;

        //JOptionPane.showMessageDialog(null,x1 + "\n" + x2);

        JOptionPane.showMessageDialog(null,"Values: " + x);
    }
}
