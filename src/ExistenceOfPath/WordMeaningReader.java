package ExistenceOfPath;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordMeaningReader {

	public static void main(String[] args) {

		try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\zkash\\OneDrive\\Desktop\\eclips 2021\\FinalTakeHomeExamPracticalQAJune2023\\src\\ExistenceOfPath\\word and meanings"))) {
			Map<String, String> wordMeanings = new HashMap<>();
			String line;

			while ((line = reader.readLine()) != null) {
				String[] parts = line.split("-");
				if (parts.length != 2) {
					System.err.println("Invalid line format: " + line);
					continue; 
				}

				String word = parts[0].trim();
				String meaning = parts[1].trim();
				wordMeanings.put(word, meaning);
			}

			for (Map.Entry<String, String> entry : wordMeanings.entrySet()) {
				System.out.println(entry.getKey());
				System.out.println(entry.getValue());
				System.out.println(); 
			}
		} catch (IOException e) {
			System.err.println("Error reading file:" + e.getMessage());
		}

	}

}
