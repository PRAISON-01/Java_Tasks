/*
LargestNumberArrayMethod
*/

public class LargestNumberArrayMethod {

    public static void main(String[] args){
        int[] number = {-9000, 100, 12, 5004};

        System.out.println(largestOf(number));
    }

    public static int largestOf(int[] array){
        int largest = array[0];

        for(int count = 0; count < array.length; count++){
            if(array[count] > largest){
                largest = array[count];
            }

        }
        return largest;

    }

}
