package level5;

import java.util.Scanner;

public class _1065 {
	// ref : http://rightbellboy.tistory.com/38

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		if (n < 100) {
			System.out.println(n);
		} else {
			int result = 99;
			for (int i = 100; i <= n; i++) {
				result += checkHanNumber(i);
			}
			if (n == 1000)
				result--;

			System.out.println(result);
		}

		sc.close();
	}

	static int checkHanNumber(int num) {
		int num1 = num / 100 % 10;
		int num2 = num / 10 % 10;
		int num3 = num % 10;

		if (num1 + num3 == num2 * 2)
			return 1;

		return 0;
	}
}
