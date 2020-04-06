
package exercise3;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Main {
    public static void main(String[]args){
    //Qeustion A
    Scanner sc = new Scanner(System.in);
    
    //Question B
    int x = sc.nextInt();
    int y = sc.nextInt();
    
    //Question C
    System.out.println("Product of " + x + " and " + y + " is: " + 
            Math.multiplyExact(x, y));
    }
}