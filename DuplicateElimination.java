/*
Duplicate Elimination


*/
import java.util.Scanner;

public class DuplicateElimination{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[] array = new int[10]

        int number = 0
        for(; number < array.length; number++){
            System.out.print("Enter a number between 1 and 100 => ");
            array[number] = input.nextInt();
            if( array[number] < 10 || array[number] > 100){
                array[number] = 0;       
            }
            
           
        }

        
        
        }       

}
