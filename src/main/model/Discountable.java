package src.main.model;

public interface Discountable {
    default double getDiscount () {
        return 0;
    }

}
