package level4;

import java.util.Scanner;

public class _4344 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int C = sc.nextInt();

		for (int c = 0; c < C; c++) {
			int student = sc.nextInt();
			int[] students = new int[student];
			double avg = 0;
			for (int i = 0; i < student; i++) {
				students[i] = sc.nextInt();
				avg += students[i];
			}

			avg /= student;
			int count = 0;
			for (int i = 0; i < student; i++)
				if (students[i] > avg)
					count++;

			System.out.printf("%.3f", (double) count / student * 100);

			System.out.println("%");
		}

		sc.close();
	}
}
