package level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1316 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		for(int n=0;n<N;n++) {
			String word = br.readLine();
			if(isGroupWord(word,word.length())) {
				cnt++;
			}
				
		}
		
		System.out.println(cnt);

		br.close();
	}
	
	static boolean isGroupWord(String word,int wordLen) {
		boolean[] check = new boolean['z'-'a'+1];
		char tmp = word.charAt(0);
		for(int i=1;i<wordLen;i++) {
			if(check[word.charAt(i)-'a'])
				return false;
			if(tmp!=word.charAt(i)) {
				check[tmp-'a'] = true;
				tmp = word.charAt(i);
			}
		}
		return true;
	}
	
}