/*
range function
*/

public class RangeFunction {

    public static int getRange(int[] arrays){
        int largest = arrays[0];
        int smallest = arrays[0];
    

        for(int index = 1; index < arrays.length; index++){
            if(arrays[index] > largest){
                largest = arrays[index];
            }
            if(arrays[index] < smallest ){
                smallest = arrays[index];
            }
            
        }
        int range = largest - smallest;
            return range;

    }


}
