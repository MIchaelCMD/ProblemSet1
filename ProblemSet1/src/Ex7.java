import javax.swing.*;

public class Ex7 {
    public static void main(String[] args) {

        String userNumAS = JOptionPane.showInputDialog("Enter a number: ");

        int userNum;
        userNum = Integer.parseInt(userNumAS);

        while(userNum != -1)
        {
            if(isEven(userNum))
                System.out.println("This number is even");
            else
                System.out.println("This number is odd");


            userNumAS = JOptionPane.showInputDialog("Enter a number: ");

            userNum = Integer.parseInt(userNumAS);

        }
    }

    public static boolean isEven(int Num1)
    {
        boolean even = (Num1%2)==0;

        return even;

    }


}
