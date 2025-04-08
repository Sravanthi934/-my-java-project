// Project on Average of three numbers .
import java.util.Scanner;
public class Project {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        Double num1;
        Double num2;
        Double num3;

        System.out.println("please enter three numbers");
        num1 = keyboard.nextDouble();
        num2 = keyboard.nextDouble();
        num3 = keyboard.nextDouble();
       // keyboard.nextDouble();

     Double average = (num1 + num2 + num3) / 3.0;
        System.out.println("Average is " + average);
    }
}
