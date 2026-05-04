/*
SumOfDigits.java

testThatSumOfDigits123returns6

testThatSumOfDigits0returns0

testThatSumOfDigits999returns27

testThatSumOfDigits1000returns1
*/
import java.util.Scanner;
public class SumOfDigits{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("ENter A Number: ");
        int number = input.nextInt();

        System.out.println(getSumOf(number));
    }

    public static int getSumOf(int number){

        int sum = 0;
        while(number > 0){
            int lastDigits = number % 10;
            sum+= lastDigits;
            number /= 10;
        }
        return sum;
    }

}
