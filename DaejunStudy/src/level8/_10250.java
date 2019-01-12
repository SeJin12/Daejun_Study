package level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10250 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		while (T-- > 0) {
			String[] s = br.readLine().split(" ");
			int H = Integer.parseInt(s[0]);
			int W = Integer.parseInt(s[1]); // W�� ���� ���ϴµ� �ʿ䰡 ����. ���� ������ �δ� �� �ܿ�
			int N = Integer.parseInt(s[2]);

			int floor = N % H;
			int room = (N / H) + 1;
			if (N % H == 0) {
				floor = H;
				room -= 1;
			}

			System.out.println(floor * 100 + room);
		}

		br.close();
	}
}
