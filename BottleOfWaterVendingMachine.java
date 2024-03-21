package HW01;

import java.util.ArrayList;
import java.util.List;

public class BottleOfWaterVendingMachine implements VendingMachine {

    List<BottleOfWater> bottleOfWaterList = new ArrayList<>();

    @Override
    public void initProducts() {
    }

    public void initProducts(List<BottleOfWater> bottle){
        this.bottleOfWaterList = bottle;
    }

    @Override    
    public Product getProduct(String name) {
        for (BottleOfWater bottle : bottleOfWaterList) {
            if (bottle.getName().equals(name))
                return bottle;
        }
        return null;
    }

}
