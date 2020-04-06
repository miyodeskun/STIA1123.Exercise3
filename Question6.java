
package exercise3;
import java.util.Scanner;
/**
 *
 * @author Amirul Luqman
 */
public class Main {
    public static void main(String[]args){
    //Qeustion A
    Scanner sc = new Scanner(System.in);
    
    //Question B
    System.out.print("Input 1st integer:");
    int x = sc.nextInt();
    System.out.print("Input 2nd integer:");
    int y = sc.nextInt();
    
    //Question C
    System.out.println("Product of " + x + " and " + y + " is: " + 
            Math.multiplyExact(x, y));
    }
}
