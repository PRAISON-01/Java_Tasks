/*Print Even number from 1 to 1000*/
public class EvenCount{
    public static void main(String[] agrs){

        for(int count = 2; count <= 1000; count++){
            if(count % 2 == 0) System.out.print(count + "     ");

            if(count % 10 == 0) System.out.println();
        }

    }
}
