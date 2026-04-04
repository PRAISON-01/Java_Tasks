import java.util.Scanner;

public class QuestionThirteen {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("What city do you live in? ");
    String city = input.nextLine();

    System.out.printf("you live in %s ", city);
    
 }
}
