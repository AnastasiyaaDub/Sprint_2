package src.main.model;

public abstract class Food {

    private int amount;                  //количество продукта в килограммах
    private double price;                //цена за единицу
    private boolean isVegetarian;        //вегетарианский ли продукт

    public Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;

    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    protected double getTotalPrice() {
        return amount * price;
    }

}
