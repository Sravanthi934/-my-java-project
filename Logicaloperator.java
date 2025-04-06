public class Logicaloperator {
    public static void main(String[] args){
        boolean isRaining = true;
        boolean isWarming = false;
        boolean combined=  isRaining && isWarming;
        System.out.println("is it raining and warming?: " + combined);
        combined= isRaining || isWarming;
        System.out.println("is it raining or warming?: " + combined);
        combined= !isWarming;
        System.out.println("is it not warming? :" + combined);
    }// end main
    
}
