package module.exception;

public class ExceptionFinally {
    public static void main(String[] args) {
       System.out.println(divide(2, 0)); 
    }

    public static int divide(int a , int b){
        try{
            return a/b;
        }catch(Exception e ){
            // e.getMessage();
            return -1;
        }
        finally{
            System.out.println("this is an exception");
        }
    }
}
