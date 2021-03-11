package task2;

public class TShirt extends Clothes implements WearMan, WearWoman{

    public TShirt(ClothesSize size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void wearMan() {

    }

    @Override
    public void wearWoman() {

    }
}
