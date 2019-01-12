package level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2675 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int t = 0; t < T; t++) {
			String[] input = br.readLine().split(" ");
			int R = Integer.parseInt(input[0]);

			for (int i = 0; i < input[1].length(); i++) {
				for (int r = 0; r < R; r++) {
					System.out.print(input[1].charAt(i));
				}
			}
			System.out.println();

		}

		br.close();
	}
}
