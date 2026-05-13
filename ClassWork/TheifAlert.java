/*Write a program that simulates the catching of a theif 

Hint: the program ends when you enter thief*/

import java.util.Scanner;

public class TheifAlert{

    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        String alert;

        
        while(true){

            System.out.print("Do you see a theif (Enter yes/no): ");
            alert = input.nextLine().trim();
           

            if(alert.equalsIgnoreCase("theif")){
                break;
            }
       

            if(alert.equalsIgnoreCase("yes")){
                break;
            }

        }
        System.out.println("Theif Caught");
        

    }

}
