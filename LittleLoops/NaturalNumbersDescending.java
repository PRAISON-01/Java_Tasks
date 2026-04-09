//Print numbers from 1 to N (user input) and print vertically
import java.util.Scanner;

public class NaturalNumbersDescending {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter N number : ");
    int Nnumber = input.nextInt();
    for (int i = Nnumber; i >= 1; i++) {
        System.out.println(i);
    }
 }
}
