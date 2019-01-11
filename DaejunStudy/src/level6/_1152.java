package level6;

import java.util.Scanner;

public class _1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.nextLine().split(" ");

		int ret = 0;

		for (int i = 0; i < s.length; i++) {
			if (s[i].equals("")) {
			} else
				ret++;
		}
		System.out.println(ret);
		sc.close();
	}
}
