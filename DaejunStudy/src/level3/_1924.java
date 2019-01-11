package level3;

import java.util.Scanner;

public class _1924 {

	static final int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int day = sc.nextInt();

		int count = 0;
		for (int i = 0; i < month; i++)
			count += days[i];

		count += day;

		count %= 7;

		switch (count) {
		case 1:
			System.out.println("MON");
			break;
		case 2:
			System.out.println("TUE");
			break;
		case 3:
			System.out.println("WED");
			break;
		case 4:
			System.out.println("THU");
			break;
		case 5:
			System.out.println("FRI");
			break;
		case 6:
			System.out.println("SAT");
			break;
		case 0:
			System.out.println("SUN");
			break;
		}

		sc.close();
	}
}
