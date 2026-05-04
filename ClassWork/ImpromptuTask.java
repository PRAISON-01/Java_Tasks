import java.util.Scanner;

public class ImpromptuTask {

    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter number: ");
    int digits = input.nextInt();
    
    int counter = 1;
    for(; digits > 0; digits = digits/10 ){
         int lastDigits = digits % 10;
         int square = lastDigits * lastDigits;
         System.out.println(square + " ");

        
    }
   
    }
}
