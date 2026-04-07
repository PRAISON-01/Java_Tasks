import java.util.Scanner;

public class MultipleChecker {
 public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter First Integer : ");
    int firstNum = input.nextInt();

    System.out.print("Enter Second Integer : ");
    int secondNum = input.nextInt();

    if (firstNum % secondNum == 0) {
        System.out.println(firstNum +" Is a Multiple of"+ secondNum);
    } else {
        System.out.println(firstNum +" Is NOT Multiple of "+ secondNum);
    }
 }     
}
