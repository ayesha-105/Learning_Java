
import java.util.Scanner;

public class Takinginput {
    public static void main(String[] args) {
        System.out.println("Taking input from user");
        Scanner abc= new Scanner(System.in);  // Scanner is a class, abc is an object and System.in meaning we are taking input from user
        System.out.print("Enter your name:");
        String name = abc.nextLine();  //next line is used to take string , just only next read one word but next line read whole line
        System.out.println(name + " have  a good day ");
        System.out.print("Enter number 1:");
        int num1 = abc.nextInt();  //nextInt is a method of Scanner class
        System.out.println("You entered " + num1);
        
        
        }
    
}
 