# STIA1123 Exercise3
# Question 1
    Write TWO (2) different ways to create an object from the String class.
```java
public class Main {

public static void main (String[] args{ 
  String obj1 = "1st way to create an object";
  String obj2 = new String("2nd way to create an object");
  }
}
```

# Question 2
    What is the output for the following Java statements?
    String phr = new String("Big,blue sky");
    System.out.println(phr.substring(phr.indexOf(","),7));
Output: ,blu

# Question 3
    Give your description on the output that will be produced by the execution of the following statements.
    Random rd = new Random();
    System.out.println(rd.nextInt(41) + 10);
