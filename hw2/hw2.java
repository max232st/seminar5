package org.example.seminar5.hw2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Подсчитать количество искомого слова, через map (наполнением значение, где искомое слово будет являться ключом)
 */
public class hw2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        String text = "Я люблю готовить, готовить и ещё раз готовить!";
        String searchWord = "готовить";
        System.out.println(searchWord);
        text = text.replaceAll("[.,\\(\\)!\\?\\-\\;]", "");
        List<String> arr = Arrays.asList(text.toLowerCase().split(" "));
        if (arr.contains(searchWord)){
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i).equals(searchWord)){
                    map.putIfAbsent(arr.get(i), 0);
                    map.put(arr.get(i), map.get(arr.get(i))+1);
                }
            }
            System.out.println(map.toString().replaceAll("[\\{\\}]", ""));
        }
        else
            System.out.println("Слово не найдено");
    }
}