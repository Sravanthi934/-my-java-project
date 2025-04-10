// project on divisible by 3
import java.util.Scanner;
public class Project3 {
     public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int input;
        System.out.println("please enter an integer");
        input = keyboard.nextInt();
        if(input%3==0){
        System.out.println("divisible by 3");
        }
        else{
            System.out.println("not divisible by 3");
        }
    }
    
}
