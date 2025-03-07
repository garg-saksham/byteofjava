package module.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class test2 {
    public static void main(String[] args)  throws FileNotFoundException {
        method2();
    }
    public static void method2()  throws FileNotFoundException{// here method 2 is calling we have to do it on every caller method
        method3();
    }

    public static void method3()  throws FileNotFoundException
    {    
        FileReader f1 = new FileReader("a.txt");  // here method 3 can throw exception of file not found so we have to code into try, catch block or we have to use throws keyword

    }
}
