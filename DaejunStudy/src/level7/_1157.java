package level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] word = br.readLine().toUpperCase().toCharArray();
		int[] cnt = new int[26];

		int maxCnt = 0;
		for (char c : word) {
			cnt[c - 'A'] += 1;
			if (maxCnt < cnt[c - 'A'])
				maxCnt = cnt[c - 'A'];
		}

		int su = 0;
		int index = 0;
		for (int i = 0; i < cnt.length; i++)
			if (cnt[i] == maxCnt) {
				su++;
				index = i;
			}

		if (su >= 2)
			System.out.println("?");
		else
			System.out.println((char) ('A' + index));

		br.close();
	}
}