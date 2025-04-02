import java.util.Scanner;

public class Main {
	public static String recursion(String s, int l, int r, int cnt) {
		// s - 문자열
		// l - left index
		// r - right index
		// cnt - 반복 횟수

		if(l >= r) return "1 " + cnt;
		else if(s.charAt(l) != s.charAt(r)) return "0 " + cnt;
		else return recursion(s, l+1, r-1, cnt+1);
	}

	public static String isPalindrome(String s) {
		return recursion(s, 0, s.length() - 1, 1);
	}
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			String str = sc.next();
			System.out.println(isPalindrome(str));
		}
		sc.close();
    }
}
