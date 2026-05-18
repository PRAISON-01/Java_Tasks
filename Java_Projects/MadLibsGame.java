import java.util.Scanner;

public class MadLibsGame {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter an adjective (description): ");
        String adjOne = input.nextLine();

        System.out.print("Enter a noun(animal or person): ");
        String nounOne = input.nextLine();

        System.out.print("Enter an adjective (description): ");
        String adjTwo = input.nextLine();

        System.out.print("Enter a verb end with -ing (action): ");
        String verbOne = input.nextLine();

        System.out.print("Enter an adjective (dscription): ");
        String adjThree = input.nextLine();

        System.out.println("Today I went to a " + adjOne + "zoo.");
        System.out.println("In an exhibit, i saw a "+nounOne +".");
        System.out.println(nounOne + " was " + adjTwo +" and " + verbOne);
        System.out.println(" I was "+ adjThree + "!");

    }
}
