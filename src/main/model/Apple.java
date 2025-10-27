package src.main.model;

import src.main.model.constants.Colour;

public class Apple extends Food implements Discountable {

    private String colour;   //цвет яблок


    public Apple(int amount, double price, boolean isVegetarian) {
        super(amount,price,true);
        this.colour = "red";

    }

    public Apple(int amount, int price, boolean isVegeterian) {
        super(amount, price, true);
        this.colour = "green";
    }

    @Override
    public double getDiscount() {
        if (Colour.redApple == colour) {
       }
        return 60;
    }

}
