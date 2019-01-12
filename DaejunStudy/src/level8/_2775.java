package level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2775 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		while (T-- > 0) {
			int K = Integer.parseInt(br.readLine()); // Ãş
			int N = Integer.parseInt(br.readLine()); // È£
			int[][] live = new int[K + 1][N + 1];

			for (int n = 1; n <= N; n++)
				live[0][n] = n;

			int people = 0;
			for (int k = 1; k < K; k++) {
				for (int n = 1; n <= N; n++) {
					for (int a = 1; a <= n; a++) {
						live[k][n] += live[k - 1][a];
					}
				}
			}
			for (int n = 1; n <= N; n++)
				people += live[K - 1][n];

			System.out.println(people);

		}

		br.close();
	}
}
