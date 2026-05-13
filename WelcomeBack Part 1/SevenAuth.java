import java.util.Scanner;

public class TrafficLight{

    public static void  main(String[] args){
        Scanner input = new Scanner(System.in);

        

        while(true){
            System.out.print("Enter a Number: ");
            int number = input.nextInt();
            
        if(number == 7){
        System.out.println("Correct");
            break;
        }
        else if(number < 7){
            System.out.println("Below");
        }
        else{
             System.out.println("Above");
        }


        }
    }

}
