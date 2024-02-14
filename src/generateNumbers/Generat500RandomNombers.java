package generateNumbers;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Generat500RandomNombers {
	public static void main(String[] args) {

		Random random = new Random();
		int[] randomNumbers = new int[500];
		for (int i = 0; i < randomNumbers.length; i++) {
			randomNumbers[i] = random.nextInt(1000) + 1;
		}

		Arrays.sort(randomNumbers);

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Nth smallest number (1-500): ");
		int n = scanner.nextInt();

		if (n < 1 || n > 500) {
			System.out.println("Invalid input. N must be between 1 and 500.");
			return;
		}

		System.out.println("The " + n + "th smallest number is: " + randomNumbers[n - 1]);

	}
}
