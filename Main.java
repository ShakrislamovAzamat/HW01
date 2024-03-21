package HW01;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // BottleOfWaterVendingMachine bottleOfWaterVM = new
        // BottleOfWaterVendingMachine();
        // List<BottleOfWater> bottle = new ArrayList<>();
        // bottle.add(new BottleOfWater("Cola", 100, 0.5));
        // bottle.add(new BottleOfWater("Sprite", 85, 0.45));
        // bottle.add(new BottleOfWater("Fanta", 59, 0.33));
        // bottle.add(new BottleOfWater("Aqua Minerale", 30, 0.5));

        // bottleOfWaterVM.initProducts(bottle);
        // System.out.println(bottleOfWaterVM.getProduct("Cola"));

        HotDrinksVendingMachine hotDrinksVM = new HotDrinksVendingMachine();
        List<HotDrinks> hotDrinks = new ArrayList<>();
        hotDrinks.add(new HotDrinks("Coffee", 200, 70));
        hotDrinks.add(new HotDrinks("Tea", 150, 80));
        hotDrinks.add(new HotDrinks("Chocolate", 250, 65));

        hotDrinksVM.initProducts(hotDrinks);
        System.out.println("Поиск по названию: " + hotDrinksVM.getProduct("Coffee"));

    }
}
