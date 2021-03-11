package task2;

public class Dress extends Clothes implements WearWoman{

    public Dress(ClothesSize size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void wearWoman() {

    }
}
