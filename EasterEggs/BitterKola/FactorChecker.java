import java.util.Scanner;

public class FactorChecker {
 public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter First Integer : ");
    int firstNum = input.nextInt();

    System.out.print("Enter Second Integer : ");
    int secondNum = input.nextInt();

    if (secondNum % firstNum == 0) {
        System.out.println(firstNum +" Is a factor of"+ secondNum);
    } else {
        System.out.println(firstNum +" Is NOT factor of "+ secondNum);
    }
 }     
}
