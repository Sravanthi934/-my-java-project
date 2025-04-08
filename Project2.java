// Project on Madlibsclon game
import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {
        Scanner mouse = new Scanner(System.in);
        String adjective1;
        String girlsname;
        String adjective2;
        String occupation1;
        String placename;
        String clothing;
        String hobby;
        String adjective3;
        String occupation2;
        String boysname;
        String mansname;
        System.out.print("enter an adjective1\t");
        adjective1 =mouse.nextLine();
        System.out.print("enter the girlsname\t");
        girlsname =mouse.nextLine();
        System.out.print("enter an adjective2\t");
        adjective2 =mouse.nextLine();
        System.out.print("enter an occupation1\t");
        occupation1 =mouse.nextLine();
        System.out.print("enter an placename\t");
        placename =mouse.nextLine();
        System.out.print("enter an clothing\t");
        clothing =mouse.nextLine();
        System.out.print("enter an hobby\t");
        hobby =mouse.nextLine();
        System.out.print("enter an adjective3\t");
        adjective3 =mouse.nextLine();
        System.out.print("enter an occupation2\t");
        occupation2 =mouse.nextLine();
        System.out.print("enter an boysname\t");
        boysname =mouse.nextLine();
        System.out.print("enter mansname\t");
        mansname =mouse.nextLine();
        System.out.println("there once was a " + adjective1 + " girl named " + girlsname + " who was a "  + adjective2 +  " " + occupation1 + " in the kingdom of " + placename + ".");
        System.out.println("she loved to wear " + clothing + "and to " + hobby + "she wanted to marry the " + adjective3 + " " + occupation2 + " named "+ boysname + " but her father, king "  + mansname + " forbid ger from seeing him. ");
    }
    
}
