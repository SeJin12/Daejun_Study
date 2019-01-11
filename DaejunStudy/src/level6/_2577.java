package level6;

import java.util.Scanner;

public class _2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ABC = sc.nextInt() * sc.nextInt() * sc.nextInt();

		int[] ret = new int[10];
		while (ABC != 0) {
			ret[ABC % 10] += 1;
			ABC /= 10;
		}

		for (int i : ret)
			System.out.println(i);

		sc.close();
	}
}
