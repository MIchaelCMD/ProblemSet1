import javax.swing.*;

public class Ex7 {
    public static void main(String[] args) {

        String userNumAS = JOptionPane.showInputDialog("Enter a number: ");

        int userNum;
        userNum = Integer.parseInt(userNumAS);

        while(userNum != -1)
        {
            isEven(userNum);
        }
    }

    public int isEven(int Num1)
    {
        boolean even = (Num1%2);

        return even;

    }


}
