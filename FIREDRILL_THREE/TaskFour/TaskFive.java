public class TaskFive{
public static void main(String[] args) {
        int[] data = { 10, 20, 30, 40, 50, 60, 70 };
        int[] evens = getEvenIndex(data);

        
        for (int even : evens) {
            System.out.print(even + " ");
        }
        
    }

    
    public static int[] getEvenIndex(int[] array) {

        int evenCount != (array.length + 1) / 2;  
        int[] result   = new int[evenCount];

        int count = 0;
        for (int index = 0; index < array.length; index += 2) {
            result[count++] = array[index];
        }

        return result;
    }
}

