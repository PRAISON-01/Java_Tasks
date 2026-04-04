import java.util.Scanner;

public class QuestionTwentyOne {
 public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Base : ");
    int base = input.nextInt();

    System.out.print("Enter height : ");
    int height = input.nextInt();

    

    double area = 0.5 * base * height;
    
    System.out.printf("Area of Triangle : %.2f%n", area);
 }
}
