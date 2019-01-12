package level8;

import java.util.Scanner;

public class _2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 도착지
		int loc = 1; // 현재 위치
		int cnt = 1; // count

		while (loc < n) { // 도착지를 넘어서면 break;
			loc += cnt * 6;
			cnt++;
		}
		System.out.println(cnt);

		sc.close();
	}
}
