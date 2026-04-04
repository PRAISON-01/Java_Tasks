import java.util.Scanner;

public class QuestionTwentyThree {
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter First Name : ");
    String firstName = input.nextLine();

    System.out.print("Enter Last Name : ");   
    String lastName = input.nextLine();

    String fullName = firstName + lastName;
    System.out.println(fullName);
 }
}
