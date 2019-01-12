package level7;

import java.util.Scanner;

public class _2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		sb.append(sc.nextInt());
		sb.append(sc.nextInt());
		sb.reverse();

		int A = Integer.parseInt(sb.substring(0, 3));
		int B = Integer.parseInt(sb.substring(3, 6));
		System.out.println(Math.max(A, B));

		sc.close();
	}
}