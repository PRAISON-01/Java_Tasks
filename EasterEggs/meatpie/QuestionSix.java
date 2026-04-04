import java.util.Scanner;

public class QuestionSix {
 public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a number to get the pre-increment : ");
    int x = input.nextInt();
    int y = 1 + x;
    int z = 1 + y;
    
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);

 }
}
