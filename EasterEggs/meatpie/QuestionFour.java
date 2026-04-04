import java.util.Scanner;

public class QuestionFour {
 public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter First Number : ");
    int firstNum = input.nextInt();

    System.out.print("Enter secondNumber : ");
    int secondNum = input.nextInt();

    int difference = firstNum - secondNum;
    System.out.println("difference Result : " + difference);
 }
}
