package HW01;

public class Drinks extends Product {

    private Double volume;

    public Drinks(String name, int price, double volume) {
        super(name, price);
        this.volume = volume;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }
}
