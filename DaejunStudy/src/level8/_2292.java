package level8;

import java.util.Scanner;

public class _2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // ������
		int loc = 1; // ���� ��ġ
		int cnt = 1; // count

		while (loc < n) { // �������� �Ѿ�� break;
			loc += cnt * 6;
			cnt++;
		}
		System.out.println(cnt);

		sc.close();
	}
}
