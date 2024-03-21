package HW01;

public class HotDrinks extends Product {

    int temperature;

    public HotDrinks(String name, int price, int temperature) {
        super(name, price);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "{" + " name='" + getName() + "'" + ", price='" + getPrice() + "'"
                + " temperature='" + getTemperature() + "'" + "}";
    }

}
