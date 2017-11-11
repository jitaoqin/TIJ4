package strings;
import java.io.BufferedReader;
import java.io.StringReader;
//: strings/BetterRead.java
import java.util.*;

public class BetterRead {
  public static void main(String[] args) {
	BufferedReader input = new BufferedReader(new StringReader("Sir Robin of Camelot\n22 1.61803"));
    Scanner scanner = new Scanner(input);
    String name = scanner.nextLine();
    int age = scanner.nextInt();
    double favorite = scanner.nextDouble();
    System.out.format("Hi %s.\n", name);
    System.out.format("In 5 years you will be %d.\n",age + 5);
    System.out.format("My favorite double is %f.",favorite / 2);
    System.out.println();
    scanner = new Scanner("12, 42, 78, 99, 42");
    scanner.useDelimiter("\\s*,\\s*");
    while(scanner.hasNextInt())
      System.out.println(scanner.nextInt());
  
    
  }
} /* Output:
What is your name?
Sir Robin of Camelot
How old are you? What is your favorite double?
(input: <age> <double>)
22
1.61803
Hi Sir Robin of Camelot.
In 5 years you will be 27.
My favorite double is 0.809015.
*///:~
