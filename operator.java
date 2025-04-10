public class operator {
    public static void main(String[] args){
        int a= 10;
        int b=15;
        int sum; //declaration
        int diff;
        int product; // declaration
        int div;
        int modulo;
        sum= a+b; //initilazation
        diff= a-b;
        product= a*b;
        div= a/b;
        modulo= a%b;
        System.out.println("sum is " + sum);
        System.out.println("difference is " + diff);
        System.out.println("product is " + product);
        System.out.println("division is " + div);
        System.out.println("modulo div is " + modulo);
        sum +=5; //sum = sum + 5;
        System.out.println("sum is now " + sum);
        sum ++;
        System.out.println("sum is " + sum++);
        sum--;
        System.out.println("sum is " + sum--);
        product *= 2;
        System.out.println("product is " + product);
        
    }
}
