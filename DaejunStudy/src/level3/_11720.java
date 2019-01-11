package level3;

import java.util.Scanner;

public class _11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		sc.nextLine();
		String s = sc.nextLine();
		for(int i=0;i<n;i++) {
			sum += Integer.parseInt(s.charAt(i)+"");
		}
		System.out.println(sum);
		
		sc.close();
	}
}
