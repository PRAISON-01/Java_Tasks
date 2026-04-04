import java.util.Scanner;

public class QuestionTwentyTwo {
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Radius : ");
    int radius = input.nextInt();

    int radiusSq = radius * radius;
    double pi = 3.142;
    double area = radiusSq * pi;
    System.out.printf("Area of circle : %.2f%n", area);
 }
}
