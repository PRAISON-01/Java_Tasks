public class PentagonalNumber{

    public static void main(String[] args){
        System.out.print("Pentagonal NUmbers from 1 to 100:  ");

        for(int index = 0; index <= 100; index++){
            System.out.printf("%7d",getPentagonalNumber(index));

            if(index % 10 == 0){
                System.out.println();
            }
        }
    }

    public static int getPentagonalNumber(int number){
        int result = (number * ((3*number) - 1)) / 2;
        return result;
    }

}
