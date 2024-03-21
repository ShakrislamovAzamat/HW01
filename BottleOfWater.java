package HW01;

public class BottleOfWater extends Drinks {


    public BottleOfWater(String name, int price, Double volume) {
        super(name, price, volume);
    }

    @Override
    public String toString() {
        return "{" + " name='" + getName() + "'" + ", price='" + getPrice() + "'" + ", volume=" + getVolume() + "}";
    }

}
