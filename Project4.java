// Project on arrays
import java.util.Scanner;
public class Project4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] somevalues = new int[5];
        for(int i=0; i < somevalues.length; i++){
            System.out.print("enter an integer\t");
            somevalues[i] = keyboard.nextInt();
        }// end for
        for(int i=0; i < somevalues.length; i++){
            int result = somevalues[i] *2;
            System.out.println(result + "result");
        }


    }//end main
    
}
