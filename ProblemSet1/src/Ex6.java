import javax.swing.*;
import java.awt.*;

public class Ex6 {

    public static void main(String[] args) {

        JTextArea textArea = new JTextArea(10,40);
        Font f = new Font("monospaced",Font.PLAIN,12);
        textArea.setFont(f);
        textArea.setText(String.format("%-10s%s\n\n","Number","Cube"));

        for(int i = 0;i <= 15; i++)
        {
            textArea.append(" " + i + "          " + cube(i) + "\n");
        }

        //JOptionPane.showMessageDialog(null,"\n" + i + cube(i) ,"Cubes!!",JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null,textArea,"Numbers",JOptionPane.INFORMATION_MESSAGE);
    }

    private static double cube(int i) {

        double cubed = i * i * i;
        //return textArea.append(String.format("%-10d%d\n",i,i * i * i));
        return cubed;
        //Test??
    }
}
