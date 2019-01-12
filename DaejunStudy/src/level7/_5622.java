package level7;

import java.util.Scanner;

public class _5622 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		int[] number = { 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10 };

		int time = 0;

		for (int i = 0; i < word.length(); i++) {
			time += number[word.charAt(i) - 'A'];
		}

		System.out.println(time);

		sc.close();
	}
}