package level5;

import java.util.Arrays;

public class _4673 {
	static int[] check = new int[10001];

	public static void main(String[] args) {
		Arrays.fill(check, -1);

		for (int i = 1; i < 10001; i++) {
			if (check[i] == -1)
				selfNumber(i, true);
		}
		for (int i = 1; i < 10001; i++) {
			if (check[i] == 1)
				System.out.println(i);
		}

	}

	static void selfNumber(int num, boolean b) {
		if (num > 10000)
			return;
		if (check[num] != -1)
			return;
		if (b)
			check[num] = 1;
		else
			check[num] = 0;
		int next = num;
		while (num != 0) {
			next += (num % 10);
			num /= 10;
		}
		selfNumber(next, false);
	}
}
