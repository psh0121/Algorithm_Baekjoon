import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] str = sc.nextLine().split("");
		
		int maxCnt = Integer.MIN_VALUE;
		
		for(int i = 0; i < str.length; i++) {
			if(str[i].equals(" ")) continue;
			
			String word = str[i];
			int cnt = 0;
			
			for(int j = i; j < str.length; j++) {
				if(word.equals(str[j])) {
					cnt++;
					str[j] = " ";
				}
			}
			
			maxCnt = Math.max(maxCnt, cnt);
		}
		
		System.out.println(maxCnt);
	}
}

