package level2;

import java.util.Scanner;

public class _2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x = 0;

		while (true) {
			if (N % 5 == 0) {
				System.out.println(N / 5 + x);
				break;
			} else if (N <= 0) {
				System.out.println(-1);
				break;
			}
			N -= 3;
			x++;
		}

		sc.close();
	}

}
