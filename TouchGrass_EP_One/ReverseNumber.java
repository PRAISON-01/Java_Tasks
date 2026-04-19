import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter Number to reverse: ");
    int number = input.nextInt();
    
    while(number > 0){
    int digit = number % 10;
    number /= 10;
    System.out.print(digit);
    }
    }   
    
}
