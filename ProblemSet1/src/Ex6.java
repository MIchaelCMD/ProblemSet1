import javax.swing.*;
import java.awt.*;

public class Ex6 {

        JTextArea textArea = new JTextArea(10,40);
        Font f = new Font("monospaced",Font.PLAIN,12);
        textArea.setFont(f);
        textArea.setText(String.format("%-10s%s\n\n","Number","Cube"));

    public static void main(String[] args) {

        for(int i;i <= 15;i++)
        {
            cube(i);
        }

        JOptionPane.showMessageDialog(null,"Number");
    }

    private double cube(int i) {

        return textArea.append(String.format("%-10d%d\n",i,i * i * i));

        //Test??
    }
}
