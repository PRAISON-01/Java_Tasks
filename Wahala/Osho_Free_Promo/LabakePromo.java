import java.util.Scanner;

class LabakePromo{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print(
        """
        ----------WELCOME TO LABAKE OSHO FREE PROMO----------

        'Oshofree'- Lagos slang for getting something for free. Labake Nigeria is running a promo: the more you spend, the bigger your discount.

        (press any key to continue!). 
        """
        );
        
        String enter = input.nextLine();

        Sytsem.out.print("""
        ===================================================
        Cart Total          ||   Discount   ||   Promo Code
        ===================================================

        Less than #5,000    ||      0%      ||  STARTER10
        --------------------------------------------------
        #5,000 - #14,999    ||      10%     ||  STARTER10
        --------------------------------------------------
        #15,000 - #29,999   ||      20%     ||  BIGBOY20
        ---------------------------------------------------
        #30,000 and above   ||      35%     ||  OSHOFREE35
        ----------------------------------------------------
        """
        );
       
//        System.out.print("What Did you buy?");
//        String item = input.nextInt();

        System.out.print("Enter Cart Total => ");
        int cartTotal = input.nextInt();

        Syste.out.print("Enter promocode => ");
        String promoCode = input.nextLine()

        receipt = getDiscount(cartTotal, promoCode);

        String interface 
    }

}
