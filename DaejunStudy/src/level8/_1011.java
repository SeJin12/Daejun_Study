package level8;

import java.util.Scanner;

public class _1011 {
	// TODO : http://kyome.tistory.com/26 ºÐ¼®
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int t = 0; t < T; t++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int dist = y - x;

			int n = (int) Math.ceil(Math.sqrt(dist));
			int maxDist = (int) Math.pow(Math.ceil(Math.sqrt(dist)), 2);
			int maxNum = n * 2 - 1;
			int numberOfTimes = maxNum;

			if (dist <= maxDist - n)
				numberOfTimes = maxNum - 1;
			System.out.println(numberOfTimes);
		}

		sc.close();
	}
}
