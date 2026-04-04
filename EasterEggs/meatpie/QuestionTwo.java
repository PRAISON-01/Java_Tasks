import java.util.Scanner;

public class QuestionTwo {
 public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("How old are you?! : ");
    int age = input.nextInt();
    
    System.out.printf("You are %d years old%n", age);
  }
}
