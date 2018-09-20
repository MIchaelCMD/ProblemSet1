import javax.swing.*;

public class Ex1 {
    public static void main(String[] args) {

        String exRateAS = "", amtToCovertAS = "";
        float exRate, amtToCovert = 0;

        exRateAS = JOptionPane.showInputDialog("Enter the exchange rate for euro to GBP: ");

        exRate = Float.parseFloat(exRateAS);

        amtToCovertAS = JOptionPane.showInputDialog("Enter the amount of pounds to covert to euro: ");

        amtToCovert = Float.parseFloat(amtToCovertAS);

        while(!amtToCovertAS,equals(""))
        {
            JOptionPane.showMessageDialog(null, "You will receive " + String.format("%.2f", (amtToCovert * exRate)) + " Euro from " + amtToCovert + " Pounds at the exchange rate found in title", "Exchange Rate: " + exRate, JOptionPane.INFORMATION_MESSAGE);

            // System.out.printf("%s",String.format("%.2f",(amtToCovert * exRate)));


            // CHANGES ARE FUNNNNNN
        }
    }
}
