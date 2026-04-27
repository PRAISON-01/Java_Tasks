public class BackToSender {

    public static int riderPayment(int successfulDelivery){
        
        int collectionRate = successfulDelivery;

        int amountPerParcel;

        if (collectionRate < 50){
            amountPerParcel = 160;
        }
        else if( collectionRate >= 50 && collectionRate <=59){
            amountPerParcel = 200;
        }
        else if(collectionRate >= 60 && collectionRate <= 69){
            amountPerParcel = 250;
        }
        else {
            amountPerParcel = 500;
        }

        int basePay = 5000;
        int totalPay = (successfulDelivery * amountPerParcel) +  basePay;

        return totalPay;

        

    }
}
