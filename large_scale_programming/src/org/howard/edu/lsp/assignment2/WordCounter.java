package org.howard.edu.lsp.assignment2;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCounter {
    public static void main(String[] args) {
        WordCounter counter = new WordCounter();
        try {
            List<String> lines = counter.readFile("src/org/howard/edu/lsp/assignment2/words.text");
            counter.countWords(lines);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<String> readFile(String filePath) throws Exception {
        return Files.readAllLines(Paths.get(filePath));
    }

    public void countWords(List<String> lines) {
        Map<String, Integer> wordCounts = new HashMap<>();

        for (String line : lines) {
            // Use regex to split the line into words, ignoring punctuation and numbers
            String[] words = line.split("[^a-zA-Z]+");

            for (String word : words) {
                word = word.toLowerCase(); // Convert word to lowercase
                if (word.length() > 3) { // Ignore words with 3 or fewer letters
                    wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                }
            }
        }

        // Print out the word counts
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
    }
}
