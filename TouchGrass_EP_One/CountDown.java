import java.util.Scanner;

public class CountDown {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Start countdown from: ");
    

    for(int start = input.nextInt(); start >= 1; start--){
        System.out.println(start);
    }
    System.out.println("BLAST OFF! 🚀️🚀️🚀️");
    }
}
