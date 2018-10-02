import javax.swing.*;

public class Ex8 {

    public static void main(String[] args) {

        String[] arrayAS = new String[10];


        for(int i = 0; i < arrayAS.length; i++)
        {

            arrayAS[i]= JOptionPane.showInputDialog("Enter Value For Array["+(i + 1)+"].");

        }

        JOptionPane.showMessageDialog(null,"The first value in the array is: " +
                arrayAS[0] + "\nThe fifth value is: " + arrayAS[4] +".");
    }
}
