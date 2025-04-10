public class Controlstatements{
    public static void main(String[] args){
     int age = 19;
     int i;
     System.out.println(age); //sequential control statment
     if(age>=16){//selectin(decision)
     System.out.println("you may drive");
     }
     else{
     System.out.println("you may not drive");
     }// end ifelse
     for(i=1; i<=age; i++) //repetotion(loop)
     {
     System.out.println("happy birthday " + age);
     }// end for
    }//end main
}
