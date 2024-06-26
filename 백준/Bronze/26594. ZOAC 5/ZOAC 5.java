import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int cnt = 1;

		char beforeChar = str.charAt(0);

		for(int i = 1; i < str.length(); i++) {
			char strChar = str.charAt(i);
			if(strChar == beforeChar) cnt++;
			else break;
		}

		System.out.println(cnt);
		sc.close();
    }
}