package exercise3;
import java.util.Random;
/**
 *
 * @author Amirul Luqman
 */
public class Exercise3 {

    public static void main(String[] args) {
        
        Random x = new Random();
        
        int num1 = x.nextInt(100);
        int num2 = x.nextInt(100);
        int max = Math.max(num1, num2);
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("Largest value number: " + max);
    }  
}
