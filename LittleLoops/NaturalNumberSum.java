// find the sum of the first N numbers (user input) and print vertically

import java.util.Scanner;
public class NaturalNumberSum {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter N of numbers : ");
    int num = input.nextInt();
    int sum = 0;
    int i = 1;
    while (i <= num) {
        i++;
        sum += i;
    System.out.println(sum);
    }
    
 }
}
