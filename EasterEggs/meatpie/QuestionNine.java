import java.util.Scanner;

public class QuestionNine {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("What is your name? ");
    String name = input.nextLine();

    System.out.printf("What is your favourite colour? ");
    String favColour = input.nextLine();

    System.out.printf("Hello %s your favourite colour is %s ", name , favColour);
 }
}
