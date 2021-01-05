package javapracticeset;
import java.util.Scanner;
public class practiceset5 {
   public static void main(String args[]){
      System.out.println("Enter a character ::");
      Scanner sc = new Scanner(System.in);
      char ch = sc.next().charAt(0);
      int asciiValue = ch;
      System.out.println("ASCII value of the given character is ::"+asciiValue);
   }
}
 