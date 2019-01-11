package level4;

import java.util.Scanner;

public class _1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int cycle = 0;
		int num = N;
		while (true) {
			int a = num / 10;
			int b = num % 10;
			num = b * 10 + (a + b) % 10;
			cycle++;
			if (N == num)
				break;
		}
		System.out.println(cycle);

		sc.close();
	}
}
