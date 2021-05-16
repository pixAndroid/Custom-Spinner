package com.example.customspinners.inventory;
import com.example.customspinners.R;
import java.util.ArrayList;
import java.util.List;

public class Data {

    public static List<Fruit> getFruitList() {
        List<Fruit> fruitList = new ArrayList<>();

        Fruit Avocado = new Fruit();
        Avocado.setName("Avocado");
        Avocado.setImage(R.drawable.avocado);
        fruitList.add(Avocado);

        Fruit Banana = new Fruit();
        Banana.setName("Banana");
        Banana.setImage(R.drawable.banana);
        fruitList.add(Banana);

        Fruit Coconut = new Fruit();
        Coconut.setName("Coconut");
        Coconut.setImage(R.drawable.coconut);
        fruitList.add(Coconut);

        Fruit Guava = new Fruit();
        Guava.setName("Guava");
        Guava.setImage(R.drawable.guava);
        fruitList.add(Guava);

        Fruit Lemon = new Fruit();
        Lemon.setName("Lemon");
        Lemon.setImage(R.drawable.lemon);
        fruitList.add(Lemon);

        Fruit Mango = new Fruit();
        Mango.setName("Mango");
        Mango.setImage(R.drawable.mango);
        fruitList.add(Mango);

        Fruit Orange = new Fruit();
        Orange.setName("Orange");
        Orange.setImage(R.drawable.orange);
        fruitList.add(Orange);

        return fruitList;
    }

}
