package src.main;

import src.main.model.Apple;
import src.main.model.Food;
import src.main.model.Meat;
import src.main.service.ShoppingCart;



public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5,100, false);
        Apple redApples = new Apple(10,50, true);
        Apple greenApples = new Apple(8, 60, true);

        Food[] foods = {meat, redApples, greenApples};

        ShoppingCart cart = new ShoppingCart(foods);


        System.out.println("Общая сумма товаров без скидки: " + cart.getTotalPriceWithoutDiscount() + " руб.");
        System.out.println("Общая сумма товаров со скидкой: " + cart.getTotalPriceWithDiscount() + " руб.");
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + cart.getTotalVegetarianPriceWithoutDiscount() + " руб.");
    }

}
