import javax.swing.*;

public class Ex9 {
    public static void main(String[] args) {

        String[] weightsAS = new String[10];
        String weightOutput = "";
        double[] weights = new double[10];
        int under250 = 0, over400 = 0, minValue = weights[0];

        for(int i = 0; i < weightsAS.length; i++)
        {

            weightsAS[i]= JOptionPane.showInputDialog("Enter Value For Array["+(i + 1)+"].");

            weights[i] = Double.parseDouble(weightsAS[i]);

            weightOutput += weightsAS[i] + "KG ";

            if(weights[i] < 250)
            {
                under250++;
            }

            if(weights[i] > 400)
            {
                over400++;
            }

            if(weights[i] < )
        }

        JOptionPane.showMessageDialog(null,"Weights: " + weightOutput + "\n" +
                "Total animals below 250KG: " + under250 + "\n" +
                "Percentage over 400KG: " + (over400*10) + "%\n" +
                "","Animal Weight Stats",JOptionPane.INFORMATION_MESSAGE);
    }
}
