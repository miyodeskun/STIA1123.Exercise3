
package exercise3;

/**
 *
 * @author Amirul Luqman
 */
public class Question7 {
    public static void main(String[]args){
        String text1 = "School of Computing";
        String text2 = "College of Arts and Sciences";
        String text3 = "UUM Sintok";
        //Question A
        System.out.println("length of (" + text1 + ") : " + text1.length());
        System.out.println("length of (" + text2 + ") : " + text2.length());
        System.out.println("length of (" + text3 + ") : " + text3.length());
        System.out.println("Total length :" + (text1.length()+text2.length()+
                text3.length()));
        
        //Question B
        System.out.println(text2.substring(0,20) + text1.substring(10,19));
    }
}
