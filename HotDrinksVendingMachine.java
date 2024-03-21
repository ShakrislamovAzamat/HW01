package HW01;

import java.util.ArrayList;
import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine {

    List<HotDrinks> hotDrinksList = new ArrayList<>();

    @Override
    public void initProducts() {
    }

    public void initProducts(List<HotDrinks> hotDrink) {
        this.hotDrinksList = hotDrink;
    }

    @Override
    public Product getProduct(String name) {
        for (HotDrinks hotDrink : hotDrinksList) {
            if (hotDrink.getName().equals(name))
                return hotDrink;
        }
        return null;
    }

}
