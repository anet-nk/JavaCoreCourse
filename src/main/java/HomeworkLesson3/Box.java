package HomeworkLesson3;

import java.util.ArrayList;

public class Box<E extends Fruit> {
    private ArrayList<E> box;

    public Box() {this.box = new ArrayList<>();}

    public ArrayList<E> getBox() {return box;}

    public void fillBoxFruit(E fruit, int fruitNumber) {
        for (int i = 0; i < fruitNumber; i++) {
            box.add(fruit);
        }
    }

    public float getWeight() {
        if (box.size() == 0) {
            return 0;
        }
        return box.size() * box.get(0).getWeight();
    }

   public boolean compare(Box<?> box) {
        return Math.abs(this.getWeight() - box.getWeight()) < 0.00001;
    }

    public ArrayList<E> pourIntoBox(Box<E> box) {
        box.getBox().addAll(this.box);
        this.box.clear();
        return box.getBox();
    }
 }
