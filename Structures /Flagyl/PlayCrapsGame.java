/*Game of Craps*/
import java.security.SecureRandom;

public class PlayCrapsGame{

    public static void main(String... code){

        System.out.println(".......Play Craps.....");
        boolean won = game();
        if(won){
            System.out.print("You won!");
        }
        else{
            System.out.print("You Loose!");
        }
    }

    public static int getRandom(){
        SecureRandom random = new SecureRandom();
        
        return random.nextInt(6) + 1;
    }

    public static boolean game(){
        
        int dieOne = getRandom();
        int dieTwo = getRandom();

        int sum = dieOne + dieTwo;
        
        if(sum == 7 || sum == 11){
            System.out.println("Natural!");
            return true;
        }
        else if(sum == 2 || sum == 3 || sum == 12){
            System.out.println("Craps");
            return false;
        }

        int point = sum;

        System.out.println("Point Established => "+ point);

        while(true){
            dieOne = getRandom();
            dieTwo = getRandom();
            int newSum = dieOne +dieTwo;

            if(newSum == point){
                System.out.println("Won");
                return true;
            }
            else if(newSum == 7){
                System.out.println("Loose!");
                return false;
            }
        }
    }

//End Of Class File
}
