package mapInterface;

import java.io.*;
import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\souvi\\IdeaProjects\\java-collections\\src\\main\\java\\mapInterface\\word.txt"; // Change this to your file path
        Map<String, Integer> wordCountMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().replaceAll("[^a-zA-Z ]", "").split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        System.out.println(wordCountMap);
    }
}
