package task2;

public enum ClothesSize {

    XXS(32),
    XS(34),
    S(36),
    M(38),
    L(40);

    int euroSize;


    ClothesSize(int euroSize) {
        this.euroSize = euroSize;

    }

    public int getEuroSize() {
        return euroSize;
    }

    public void setEuroSize(int euroSize) {
        this.euroSize = euroSize;
    }
    //abstract void getDescription();


}
