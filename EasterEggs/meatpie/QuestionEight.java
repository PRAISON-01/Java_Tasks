import java.util.Scanner;

public class QuestionEight {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a Number you want to cube : ");
    int number = input.nextInt();

    int cube = number * number * number;

    System.out.printf("Cube Results : %d%n", cube);

 }
}
