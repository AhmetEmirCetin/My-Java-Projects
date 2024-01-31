import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //A scanner is defined to get values from the user.

        System.out.println("Welcome to the calculator app.");
        //Welcome has been made for the user.

        System.out.print("Please enter Number 1 = ");
        double number1 = input.nextDouble();
        //Number 1 has been requested from the user.

        System.out.print("Please enter Number 2 = ");
        double number2 = input.nextDouble();
        //Number 1 has been requested from the user.

        System.out.println("Addition=0");
        System.out.println("Subtraction=1");
        System.out.println("Multiplication=2");
        System.out.println("Division=3");
        System.out.print("Please select the action you want to take = ");
        int transaction = input.nextInt();
        //The user was asked which action he/she wanted to take.

        String Text = "the result of your operation = ";
        //Text for convenience for further processing.

        if(transaction==0){
            double Addition = number1+number2;
            System.out.print(Text+Addition);

        } else if (transaction==1) {
            double Subtraction = number1-number2;
            System.out.print(Text+Subtraction);

        } else if (transaction==2) {
            double Multiplication = number1*number2;
            System.out.print(Text+Multiplication);

        } else if (transaction==3) {
            double Division = number1/number2;
            System.out.print(Text+Division);
        } else
            System.out.print("You have made a mistake. Try again.");
    }
}
