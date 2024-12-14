import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String str = sc.next();
			String newStr = str.substring(0, str.length() - 1);
			if(str.equals("#")) break;

			int oneCnt = 0;
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == '1') oneCnt++;
			}

			if(str.charAt(str.length() - 1) == 'e') {
				if(oneCnt % 2 == 0) System.out.println(newStr + '0');
				else System.out.println(newStr + '1');
			}
			else {
				if(oneCnt % 2 == 0) System.out.println(newStr + '1');
				else System.out.println(newStr + '0');
			}
		}
		sc.close();
    }
}
