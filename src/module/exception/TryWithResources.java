package module.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {
        try (BufferedReader o = new BufferedReader(new FileReader("C:\\Users\\gargs\\OneDrive\\Desktop\\JavaLearning\\BasicJava\\src\\module\\exception\\abc.txt"))) {
            String line;
            while ((line = o.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("IOException caught " + e.getMessage());
        }
    }

}
