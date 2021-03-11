package task2;

public class Trousers extends Clothes implements WearWoman, WearMan{


    public Trousers(ClothesSize size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void wearMan() {

    }

    @Override
    public void wearWoman() {

    }
}
