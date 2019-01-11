package level1;

import java.util.Scanner;

public class _11719 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNextLine()) {
			String a = sc.nextLine();
			if(a.isEmpty()||a.length()<=100)
				System.out.println(a);
		}
		
		sc.close();
	}
}
