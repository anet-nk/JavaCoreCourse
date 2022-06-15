package HomeworkLesson4;

import java.util.HashMap;

public class WordSetArray {
    //1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
    // Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
    // Посчитать, сколько раз встречается каждое слово.

    public static void main(String[] args) {
        String[] wordsSet = {"World", "Hello", "test", "GoodDay", "flower", "test", "Hello", "test", "goodDay", "GoodDay", "World"};
        HashMap<String, Integer> wordsSetMap = new HashMap<>();
        for (int i = 0; i < wordsSet.length; i++) {
            if(wordsSetMap.containsKey(wordsSet[i])) {
                wordsSetMap.put(wordsSet[i], wordsSetMap.get(wordsSet[i]) + 1);
            } else {
                wordsSetMap.put(wordsSet[i], 1);
            }
        }
        System.out.println(wordsSetMap);
    }
}
