package level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1475 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] arr = br.readLine().toCharArray();
		int[] save = new int[9];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '6' || arr[i] == '9') {
				save[6] += 1;
				continue;
			}
			save[arr[i] - '0'] += 1;
		}
		save[6] = (int) Math.ceil(save[6] / 2.0);
		int set = 0;
		for (int s : save)
			set = Math.max(set, s);

		System.out.println(set);

		br.close();
	}
}
