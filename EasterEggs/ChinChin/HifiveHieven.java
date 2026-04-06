import java.util.Scanner;

public class HifiveHieven {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter any Integer : ");
    int integer = input.nextInt();
    
    if (integer % 5 == 0 ) System.out.println("Hi-Five");
    if (integer % 2 == 0 ) System.out.println("Hi-Even");
 }
}
