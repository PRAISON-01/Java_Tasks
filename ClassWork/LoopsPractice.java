import java.util.Scanner;

public class LoopsPractice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int count = input.nextInt();
        for(int row = 1; row<= count; row++){
            for(int col = 1; col <= row; col++){
                if(row <= col){
                    System.out.print(" ");
                }
                else{
                    System.out.print(" *");
                }
            }
            System.out.println();
            } 
        for(int num1 = 1; num1 <= count; num1++){
            for(int num2 = count; num2 >= num1; num2--){
                 System.out.print(" *");
            }
        System.out.println();
        }
        
  
        }
}
