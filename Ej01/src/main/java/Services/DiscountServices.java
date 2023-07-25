package Services;
import Entities.Discount;

public class DiscountServices {
    Discount d = new Discount();

    public double applyDiscount(Discount d){
        double finalPrice = d.getPrice() - ((d.getPrice()*d.getDiscount())/100);
        return finalPrice;
    }


}
