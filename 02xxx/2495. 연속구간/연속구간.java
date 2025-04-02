import java.util.Scanner;

public class Main {
	public static int maxCnt(String str) {
		int maxCnt = 1;

		int curCnt = 1;
		for(int i = 1; i < str.length(); i++) {
			if(str.charAt(i-1) == str.charAt(i)) curCnt++;
			else {
				maxCnt = Math.max(maxCnt, curCnt);
				curCnt = 1;
			}
		}

		maxCnt = Math.max(maxCnt, curCnt);

		return maxCnt;
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();

		System.out.println(maxCnt(a));
		System.out.println(maxCnt(b));
		System.out.println(maxCnt(c));
		sc.close();
    }
}
