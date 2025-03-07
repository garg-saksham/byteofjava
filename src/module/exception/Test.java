package module.exception;
// learning about exceptions and how exception handles program and save it to termination  
public class Test {
   public static void main(String[] args) {
    int[] numerator = {42,30,4,66};
    int[] denominators = {21,3,0,21};
    for(int i=0;i<numerator.length;i++){
        System.out.println(divide(numerator[i],denominators[i]));
    }
    System.out.println("learning ");
   }

   public static int divide(int i , int j) {
    try{
         return i/j;
    }catch(ArithmeticException e){
        System.out.println(e.getMessage());
        return -1;
    }
   
   }
}
