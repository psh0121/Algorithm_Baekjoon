import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int[] table;

	public static void makeTable(String pattern) {
		int pLen = pattern.length();
		table = new int[pLen];

		// 접두사와 접미사를 활용해 부분문자열에 대한 정보를 담는다.
		int idx = 0;
		for(int i = 1; i < pLen; i++) {
			while (idx > 0 && pattern.charAt(i) != pattern.charAt(idx)) {
				idx = table[idx - 1];
			}

			if(pattern.charAt(i) == pattern.charAt(idx)) {
				idx++;
				table[i] = idx;
			}
		}
	}

	public static int search(String str, String pattern) {
		int sLen = str.length();
		int pLen = pattern.length();

		int idx = 0;
		for(int i = 0; i < sLen; i++) {
			while (idx > 0 && str.charAt(i) != pattern.charAt(idx)) {
				idx = table[idx - 1];
			}

			if(str.charAt(i) == pattern.charAt(idx)) {
				if(idx == pLen - 1) {
					idx = table[idx];
					return 1;
				}	
				else idx++;
			}
		}
		return 0;
	}

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		String p = br.readLine();

		makeTable(p);

		System.out.println(search(s, p));
    }
}
