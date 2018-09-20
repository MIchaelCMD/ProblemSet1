import javax.swing.*;
import java.awt.*;

public class Ex2 {
    public static void main(String[] args) {

        int yards;
        final int CONVERSION_FACTOR = 12*3;
        String list="";

        JTextArea textArea = new JTextArea(10,40);
        Font f = new Font("monospaced",Font.PLAIN,12);
        textArea.setFont(f);
        textArea.setText(String.format("%-10s%s\n\n","Yards","Inches"));

        for(yards=1;yards <= 10;yards++)
        {
            textArea.append(String.format("%-10d%d\n",yards,yards*CONVERSION_FACTOR));
            //list += String.format("%-10d%d\n",yards,yards*CONVERSION_FACTOR);


            //yards++;
        }

        JOptionPane.showMessageDialog(null,textArea,"Yards to inches table",JOptionPane.INFORMATION_MESSAGE);

    }
}
