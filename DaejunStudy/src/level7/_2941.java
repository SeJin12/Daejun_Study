package level7;

import java.util.Scanner;

public class _2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();

		int cnt = 0;
		for (int i = word.length() - 1; i >= 0; i--) {
			char c = word.charAt(i);
			if (i == 0) {
				cnt++;
				break;
			}
			if (c == '=') {
				char preC = word.charAt(i - 1);
				if (preC == 'z') {
					if (word.charAt(i - 2) == 'd') {
						cnt++;
						i -= 2;
						continue;
					}
				}
				if (preC == 'c' || preC == 's' || preC == 'z') {
					cnt++;
					i--;
					continue;
				}
			}
			if (c == '-') {
				char preC = word.charAt(i - 1);
				if (preC == 'c' || preC == 'd') {
					cnt++;
					i--;
					continue;
				}
			}
			if (c == 'j') {
				char preC = word.charAt(i - 1);
				if (preC == 'l' || preC == 'n') {
					cnt++;
					i--;
					continue;
				}
			}
			cnt++;
		}
		System.out.println(cnt);

		sc.close();
	}
}