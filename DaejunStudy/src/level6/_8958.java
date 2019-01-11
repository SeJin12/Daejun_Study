package level6;

import java.util.Scanner;

public class _8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for (int t = 0; t < T; t++) {
			char[] ox = sc.nextLine().toCharArray();
			int score = 0;
			int chain = 0;
			for (int i = 0; i < ox.length; i++) {
				if (ox[i] == 'O') {
					chain += 1;
					score += chain;
				} else {
					chain = 0;
				}
			}
			System.out.println(score);
		}

		sc.close();
	}
}
