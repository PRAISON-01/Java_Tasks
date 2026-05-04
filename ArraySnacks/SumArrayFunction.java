/*
SumArrayFunction.java
*/

public class SumArrayFunction{

    public static void main(String[] args){

        int[] numbers = {5,20,15,5};

        System.out.print(sumOf(numbers));
    }

    public static int sumOf(int[] array){
        int sum = 0;

        for(int count = 0; count < array.length; count++){
            sum += array[count];
        }

        return sum;
    }

}
