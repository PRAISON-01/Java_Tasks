/*
Reverse.java

method to solve reverse

method to checkif reverse is a palindrome


*/
import java.util.Scanner;
public class Reverse{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
     
        
        System.out.print("Enter A Number: ");
        int number= input.nextInt();

        if(isTrue(number)){
            System.out.println(number + " Is a palindrome.");
        }
        else {
            System.out.println(number + " is 'NOT' a palindrome.");
        }
    }

    public static int getReverseOf(int number){
        int reversed = 0;
        while(number != 0){
            int lastDigit = number % 10;
            reversed = reversed * 10 + lastDigit;
            number /= 10;
        }
    return reversed;
    }

    public static boolean isTrue(int number){
       return (getReverseOf(number) == number);
    }

}
