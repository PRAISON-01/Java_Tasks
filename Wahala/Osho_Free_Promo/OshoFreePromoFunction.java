public class OshoFreePromoFunction{



    public static double getDiscount(int cartTotal, String promoCode){

        if(promoCode == null){
            return cartTotal;
        }

        double discount = 0.00;

        if( (cartTotal < 5000) && ("STARTER10".equalsIgnoreCase(promoCode))){
            return cartTotal - (cartTotal * 0.00);
        }
        else if((cartTotal >= 5000 &&  cartTotal < 15000) && ("STARTER10".equalsIgnoreCase(promoCode))){
            return cartTotal - (cartTotal * 0.10);
            
        }
        else if((cartTotal >= 15000 && cartTotal < 30000 )&& ("BIGBOY20".equalsIgnoreCase(promoCode))){
            return cartTotal - (cartTotal * 0.20);


        }
        else if((cartTotal >= 30000)&& ("OSHOFREE35".equalsIgnoreCase(promoCode))){
            return cartTotal - (cartTotal * 0.35);

        }
        return cartTotal;
    }


}
