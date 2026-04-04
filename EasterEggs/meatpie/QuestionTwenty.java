import java.util.Scanner;

public class QuestionTwenty {
 public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter length : ");
    int length = input.nextInt();

    System.out.print("Enter Width : ");
    int width = input.nextInt();

    int area = length * width;
    System.out.printf("Area : %d%n", area);
 }
}
