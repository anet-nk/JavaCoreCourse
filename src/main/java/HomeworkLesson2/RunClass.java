package HomeworkLesson2;

public class RunClass {
    static String[][] validTwoDimArray = {{"3", "4", "5", "1"}, {"1", "9", "22", "0"}, {"4", "4", "6", "1"}, {"3", "4", "8", "10"}};
    static String[][] invalidTwoDimArray = {{"3", "4", "5", "1"}, {"1", "9", "22", "0"}, {"4", "4", "t", "1"}, {"3", "4", "8", "10"}};
    static String[][] invalidArray = {{"3", "4", "5", "1"}, {"1", "9", "22", "0"}, {"4", "4", "1"}, {"3", "4", "8", "10"}};
    static String[][] invalidArray1 = {{"3", "4", "5", "1"}, {"1", "9", "22", "0"}, {"4", "4", "1"}};

    public static void main(String[] args) {
        try {
            System.out.println(sumTwoDimArray(invalidArray, 4));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(sumTwoDimArray(invalidTwoDimArray, 4));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(sumTwoDimArray(invalidArray1, 4));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(sumTwoDimArray(validTwoDimArray, 4));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    public static int sumTwoDimArray(String[][] twoDimArray, int size) throws MyArraySizeException {
        checkArraySize(twoDimArray, size);
        int sum = 0;
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                try {
                    sum += Integer.parseInt(twoDimArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Не удалось преобразовать в число элемент с индексом [" + i + "][" + j + "]") ;
                }
            }
        }
        return sum;
    }

    public static void checkArraySize(String[][] twoDimArray, int size) throws MyArraySizeException {
        if (twoDimArray.length != size) throw new MyArraySizeException("Размер массива должен быть = [" + size + "][" + size + "]");
        for (int i = 0; i < twoDimArray.length; i++) {
            if (twoDimArray[i].length != size) throw new MyArraySizeException("Размер массива должен быть = [" + size + "][" + size + "]; размер строки " + i + " = [" + twoDimArray[i].length +"]");
        }
    }

}

