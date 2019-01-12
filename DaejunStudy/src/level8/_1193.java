package level8;

import java.util.Scanner;

public class _1193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		int cnt = 1;
		int a = 1, b = 1;
		int value = 1;
		while (cnt != x) {
			if (value % 2 != 0) {
				if (b == value) {
					b++;
					value++;
				} else {
					a--;
					b++;
				}
			} else {
				if (a == value) {
					a++;
					value++;
				} else {
					a++;
					b--;
				}
			}
			cnt++;
		}
		System.out.println(a + "/" + b);

		sc.close();
	}
}
