import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class CheckOutSystem{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String[] itemNames = new String[10];
        int[] itemQuantity = new int[10];
        int[] itemUnitPrice = new int[10];
        int itemCount = 0;
        String choice;

        System.out.println("What is the customer's name => ");
        String name = input.nextLine();
        

        while(true){

            System.out.println("What did the customer buy? => ");
            itemNames[itemCount] = input.nextLine();
            

            System.out.println("How many pieces? => ");
            itemQuantity[itemCount] = input.nextInt();

            System.out.println("How much per unit => ");
            itemUnitPrice[itemCount] = input.nextInt();

            itemCount++;

            System.out.println("Add more items to cart? => ");
            choice = input.next();
            input.nextLine();

            if(choice.equalsIgnoreCase("no")){
                break;
            }

            itemCount++;

            if (itemCount >= itemNames.length) {
                System.out.println("Cart is full! Processing checkout...");
                break;
            }

                
        }
        System.out.print("[cashier] What is your name? => ");
        String cashierName = input.nextLine();

        System.out.printf("Welcome back %s, How muh discount will the customer get?  => ",cashierName);
        int discountGiven = input.nextInt();

        double subTotal = getSubTotal(itemQuantity, itemUnitPrice, itemCount);

        double discount = getDiscount(subTotal, discountGiven);

        double vat = getVat(subTotal);

        double billTotal = (subTotal - discount) + vat;

//        int billTotal = subTotal + 


    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yy h:mm:ss a");
    String formattedDate = LocalDateTime.now().format(dtf);

    String sampleOutputOneUp = String.format(""" 

    SEMICOLON STORES

    MAIN BRANCH

    LOCATION : 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
    TEL : 091-SEMICOLON
    Date : %s
    Cashier : %s
    Customer Name : %s

    
    """,formattedDate, cashierName, name);
    System.out.println("=======================================================");
    System.out.printf("%20s %10s %12s %15s%n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
    System.out.println("-----------------------------------------------------------------");


     for (int index = 0; index < itemCount; index++) {
            int total = itemQuantity[index] * itemUnitPrice[index];
            System.out.printf("%20s %10d %12d %15d%n", itemNames[index], itemQuantity[index], itemUnitPrice[index], total);
        }

    System.out.println("-------------------------------------------------------");
    
    String sampleOutputOneDown = String.format(""" 

                                Sub Total:          %.2f

                                 Discount:          %.2f

                             VAT @ 17.50%:          %.2f

    =======================================================

                               Bill Total:          %.2f

    =======================================================
        
        THIS IS NOT A RECEIPT KINDLY PAY %.2f

    =======================================================




    How much did the customer give to you?
    """
    ,subTotal, discount, vat, billTotal, billTotal);


    int amountPaid = input.nextInt();

    }

//    public static double (int discountGiven){
//
//        return discountGiven / 100;
//    }

    public static double getSubTotal(int[] itemQuantity, int[] itemUnitPrice, int itemCount){

        int calc = 0;
       for(int index = 0; index < itemCount; index++ ){
            calc += itemQuantity[index] * itemUnitPrice[index];
        }

        return calc;
//         itemName;
    }

    public static double getDiscount(double subTotal, int discountGiven){

        return subTotal * ((double) discountGiven / 100);
    }

    public static double getVat(double subTotal){

        return subTotal * 0.175;
    }

    

}
