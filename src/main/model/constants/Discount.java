package src.main.model.constants;

import src.main.model.Discountable;
import src.main.model.Apple;

public class Discount implements Discountable {


    @Override
    public double getDiscount() {
        return Discountable.super.getDiscount();
    }
    public static final double redApple = 60;
}
