package main.java.com.eTmy.caterpillarIsland.objects.animals.herbivores;

import main.java.com.eTmy.caterpillarIsland.annotations.animals.ObjectBasicProperties;
import main.java.com.eTmy.caterpillarIsland.objects.abstracts.HerbivoreAnimal;

@ObjectBasicProperties(maxCount = 140, printName = "Овца")
public class Sheep extends HerbivoreAnimal {
    public Sheep(int positionX, int positionY) {
        super(positionX, positionY);
    }

    @Override
    public String toString() {
        return "\uD83D\uDC11";
    }
}
