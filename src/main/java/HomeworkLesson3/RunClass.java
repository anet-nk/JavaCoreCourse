package HomeworkLesson3;

import HomeworkLesson2.MyArraySizeException;

public class RunClass {

    static Object[] array = {"one", "two", "three", "four"};

    public static void main(String[] args) throws MyArraySizeException {
        //1. Задание:
        for(Object elem : array) {
            System.out.println(elem);}
        System.out.println("===============");
        swapArrayElements(array, 2, 4);
        for(Object elem : array) {
            System.out.println(elem);
        }

        //2. Задание:
        System.out.println("===============");
        Apple apple = new Apple();
        Orange orange = new Orange();
        Box<Apple> boxApple1 = new Box();
        Box<Apple> boxApple2 = new Box();
        Box<Orange> boxOrange3 = new Box();

        boxApple1.fillBoxFruit(apple, 6);
        boxApple2.fillBoxFruit(apple, 5);
        boxOrange3.fillBoxFruit(orange, 4);

        System.out.println("Посмотреть содержимое коробки с яблоками: " + boxApple1.getBox()); //проверяем, правильно ли работает метод заполнения коробки яблоками
        System.out.println("Посмотреть содержимое коробки с апельсинами: " + boxOrange3.getBox()); //проверяем, правильно ли работает метод заполнения коробки апельсинами

        System.out.println("Вес коробки с яблоками: " + boxApple1.getWeight());
        System.out.println("Вес коробки с яблоками: " + boxApple2.getWeight());
        System.out.println("Вес коробки с апельсинами: " + boxOrange3.getWeight());

        System.out.println("Сравниваем вес коробок с яблоками: " + boxApple1.compare(boxApple2));
        System.out.println("Сравниваем вес коробки с яблоками и коробки с апельсинами: " + boxApple1.compare(boxOrange3));
        System.out.println("===============");
        System.out.println("Пересыпаем яблоки из коробки 1 в коробку 2 и проверяем что получилось: " + boxApple1.pourIntoBox(boxApple2));
        System.out.println("Проверяем, что коробка 1 пуста: " + boxApple1.getBox());
    }

    //Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
    public static Object[] swapArrayElements(Object[] array, int firstElement, int secondElement) throws MyArraySizeException {
        if (firstElement > array.length || secondElement > array.length)
            throw new MyArraySizeException("Elements outside the array");
        Object element1 = array[firstElement - 1];
        array[firstElement - 1] = array[secondElement - 1];
        array[secondElement - 1] = element1;
        return array;
    }
}
