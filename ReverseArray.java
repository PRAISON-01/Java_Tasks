//collect 10 input from user using an array
//print the reverse without using another array

import java.util.Scanner;

public class ReverseArray{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
     
        int[] array = new int[10];

        for(int index = 0; index < array.length - 1; index++){
            System.out.print("Enter number => ");
            array[index] = input.nextInt();
            
        }

        System.out.print(array[index]);  
    }

}
