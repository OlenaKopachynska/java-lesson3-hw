package task2;


public class Atelie {

    TShirt tshirt = new TShirt(ClothesSize.XS, 400, "red");
    Trousers trousers = new Trousers(ClothesSize.M, 1000, "pink");
    Tie tie = new Tie(ClothesSize.L, 500, "black");
    Dress dress = new Dress(ClothesSize.S, 600, "blue");

    Clothes[] clothesArr = {tshirt, trousers, tie, dress};

    Clothes manChoice() {

        for (int i = 0; i < clothesArr.length; i++) {

            if (clothesArr[i] instanceof WearMan) {
                System.out.println(clothesArr[i]);
            }
        }
        return null;
    }


    Clothes womanChoice() {

        for (int i = 0; i < clothesArr.length; i++) {

            if (clothesArr[i] instanceof WearWoman) {
                System.out.println(clothesArr[i]);
            }
        }
        return null;
    }
}

