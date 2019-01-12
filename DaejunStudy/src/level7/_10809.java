package level7;

import java.util.Arrays;
import java.util.Scanner;

public class _10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] words = sc.nextLine().toCharArray();
		
		int[] cnt = new int[26];
		Arrays.fill(cnt, -1);
		
		for(int i=0;i<words.length;i++) {
			if(cnt[words[i]-'a']==-1)
				cnt[words[i]-'a'] = i;
		}
			
		
		for(int i:cnt)
			System.out.print(i+" ");
		
		sc.close();
	}
}
