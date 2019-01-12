package level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _6064 {
	// 방법 2
	// ref : http://andamiro25.tistory.com/93
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		while (T-- > 0) {
			String[] s = br.readLine().split(" ");
			int M = Integer.parseInt(s[0]);
			int N = Integer.parseInt(s[1]);
			int x = Integer.parseInt(s[2]);
			int y = Integer.parseInt(s[3]);

			int xp = 1, yp = 1;// p = 프라임'
			int cnt = 1;
			int d = 1;
			while (true) {
				if (xp == x)
					d = M; // xp좌표가 목표좌표(x)라면 xp고정
				else if (yp == y)
					d = N; // yp좌표가 목표좌표(y)라면 yp 고정

				// M or N 만큼 건너뛰기
				xp = ((xp + d) % M == 0) ? M : (xp + d) % M;
				yp = ((yp + d) % N == 0) ? N : (yp + d) % N;
				cnt += d;
				if (x == xp && y == yp)
					break;
				if (cnt > M * N) {
					cnt = -1;
					break;
				}
			}
			System.out.println(cnt);

		}

		br.close();
	}

}
