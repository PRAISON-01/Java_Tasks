public class FiveMultiplicationTable {

    public static void main(String[] args){
    int number = 5;
    int counter = 1;
    for(; counter <= 12; counter++){
        int product = number * counter;
        System.out.printf("%d x %d =  %d\n", number, counter, product);
    }
    }
}
