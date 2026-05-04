public class Kata {
    public static void main(String[] args){
        isMax(7,10);
        isEven(2);
        isPrimeNumber(2);
        subtract(1,2);
        division(0,3);
        factorOf(10);
        isPerfectSquare(25);
    }

    public static int isMax(int first, int second){
        System.out.printf("Maximum of the two integers %d and %d\n", first , second);
        int maximum = first;
            if(second > maximum){
                maximum = second;
            }
        System.out.printf("Maximum number of %d and %d is %d\n\n", first, second, maximum);
        return maximum;
    }

    public static boolean isEven(int evenNumber){
        System.out.printf("Is %d even?\n", evenNumber);
            if(evenNumber % 2 == 0) {
                System.out.printf("%d is na even number \n\n",evenNumber);
                return true;
            }
                
            else {
                System.out.printf("%d is 'NOT' an even number\n", evenNumber);
                 return false;
             }
               
    }

    public static boolean isPrimeNumber(int primeNumber){
        System.out.printf("Is %d a prime number?\n", primeNumber);
            if(primeNumber % 2 != 0){
                System.out.printf("%d is a prime Number\n", primeNumber);
                    return true;
            }

            else {
                System.out.printf("%d is 'NOT' a prime number\n\n", primeNumber);
                    return false;
            }
    }

    public static int subtract(int alpha, int beta){
        System.out.printf("%1d - %d = ?\n\n", alpha, beta);
        int answer = (alpha - beta);
            if (beta > alpha){
                answer = beta - alpha;
                System.out.printf("%d - %d = %d\n",beta,alpha,answer);
                return answer;
            }
            
            if (alpha < beta){
                answer = (beta - alpha);
                System.out.printf("%d - %d = %d", alpha, beta, answer);
                return answer; 
            }
        return answer;
    }


    public static float division(int dividend, int divisor){
        System.out.printf("%d divided by %d = ?\n", dividend , divisor);
        float qoutient = (dividend / divisor);
            System.out.printf("%d divided by %d = %.2f\n\n", dividend, divisor, qoutient);
        return qoutient;
    }

    public static int factorOf(int integer){
        System.out.printf("Factors of %d: ",integer);
        int count = 1;
        for (; count <= integer; count++){
            if (integer % count == 0)System.out.print(count + ",");
            }
             return count;
    }

    public static boolean isPerfectSquare(int integer){
        System.out.printf("\nIs %d a perfect Square: ",integer);
        int count = 1;
        
        for(;count * count <= integer; count++){
            if(count * count == integer ){
                return true;
            }
        }
        return false;
    }
    
}
