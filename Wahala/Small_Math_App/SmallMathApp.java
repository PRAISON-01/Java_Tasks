/*Small Math App*/
import java.util.Scanner;

public class SmallMathApp{
     double numberOne = 10;
     double numberTwo = 5;

    public static double multiply(double numberOne, double numberTwo){

        double product = numberOne * numberTwo;
        return product;
    }

     public static double add(double numberOne,double numberTwo){

        double sum = numberOne + numberTwo;
        return sum;
    }

    public static double minus(double numberOne, double numberTwo){

        double difference = numberOne - numberTwo;
        return difference;
    }


    public static double divide(double numberOne, double numberTwo){
        double quotient = 0;
        if(numberTwo == 0)throw new IllegalArgumentException("Division by Zero is Undefined");
        return numberOne / numberTwo;
    }

    public double getOperator(char operator){
            if(operator == '+'){
                return add(numberOne, numberTwo);
            }

            else if(operator == '-'){
                return minus(numberOne, numberTwo);
            }
            else if(operator == '/'){
                return divide(numberOne, numberTwo);
            }
            else if(operator == 'x'){
                return multiply(numberOne, numberTwo);
            }
            else{
             throw new IllegalArgumentException("Invalid symbol");
            }
            
        }

    
    }


