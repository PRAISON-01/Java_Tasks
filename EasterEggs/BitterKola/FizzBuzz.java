
import java.util.Scanner;

public class FizzBuzz {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter any Integer : ");
    int num= input.nextInt();

    if (num % 3 == 0 && num % 5 == 0) {
        System.out.print("FIZZBUZZ!\n");
    } else if (num % 3 ==0 ) {
        System.out.print("FIZZ!\n");
    } else if (num % 5 == 0) {
        System.out.print("BUZZ!\n");
    } else {
        System.out.println(num);
    }

 }
}
