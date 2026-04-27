/*
PizzaWahala.java

*/

public class PizzaWahala {

    public static void main

    public static int getBox(int numberOfPeople) {
        int slicesPerBox = 12;
        int boxesNeeded = (numberOfPeople + slicesPerBox - 1) / slicesPerBox;

        return boxesNeeded;
    }

    public static int getLeftOvers(int numberOfPeople){
        int slicesPerBox = 12;
        int boxesNeeded = getBox(numberOfPeople);
        int totalSlices = boxesNeeded * slicesPerBox;
        int leftOverSlices = totalSlices - numberOfPeople;

        return leftOverSlices;
    }

    public static int getTotalCost(int numberOfPeople){
        int pricePerBox = 5200;
        int boxesNeeded = getBox(numberOfPeople);
    int totalCost = boxesNeeded * pricePerBox;
    
    return totalCost;
    }



}
