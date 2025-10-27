package src.main.service;


import src.main.model.Discountable;
import src.main.model.Food;

public class ShoppingCart {
    private Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    public double getTotalPriceWithoutDiscount() {  //сумма без скидки
        double sum = 0;
        for (int i = 0; i < foods.length; i++) {
            sum = sum + foods[i].getAmount() * foods[i].getPrice();
        }
        return sum;

    }

    public double getTotalPriceWithDiscount() {  //сумма со скидкой
        double sum = 0;
        for (int i = 0; i < foods.length; i++) {
            double price = foods[i].getAmount() * foods[i].getPrice();
            if (foods[i] instanceof Discountable) {
                double discount = ((Discountable) foods[i]).getDiscount();
                price = price * ((100 - discount) / 100);
            }
            sum = sum + price;
        }
        return sum;
    }

    public double getTotalVegetarianPriceWithoutDiscount() {  //сумма вегитарианских продуктов
        double sum = 0;
        for (int i = 0; i < foods.length; i++) {
            if (foods[i].isVegetarian()) {
                sum = sum + foods[i].getAmount() * foods[i].getPrice();
            }
        }
        return sum;
    }
}
