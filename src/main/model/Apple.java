package src.main.model;

import src.main.model.constants.Colour;
import src.main.model.constants.Discount;

public class Apple extends Food implements Discountable {

    private String colour;   //цвет яблок


    public Apple(int amount, int price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if (Colour.RED_APPLE == colour) {
            return Discount.RED_APPLE;
       }
        return 0;
    }
public String getColour() {
        return colour;
}
}
