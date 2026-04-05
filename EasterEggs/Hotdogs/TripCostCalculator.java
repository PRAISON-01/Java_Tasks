
import java.util.Scanner;

public class TripCostCalculator {
 public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter Distance of Trip (Mile) : ");
    double distance = input.nextDouble();
    
    System.out.print("Enter Fuel Efficiency (Miles per gallon) : ");
    double fuelEfficiency = input.nextDouble();

    System.out.print("Enter price per fuel gallon");
    double pricePerGallon = input.nextDouble();

    double cost = (distance / fuelEfficiency) * pricePerGallon;

    System.out.printf("Cost of the trip : %.2f\n", cost);
    
 }     
}
