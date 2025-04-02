import java.util.Scanner;

public class Main {
	public static int reverseNumber(int n) {
		String reverseN = new StringBuilder(Integer.toString(n)).reverse().toString();
		return Integer.valueOf(reverseN);
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			int num = sc.nextInt();
			int reverseNum = reverseNumber(num);

			int sumNum = num + reverseNum;
			int reverseSumNum = reverseNumber(sumNum);

			if(Integer.toString(sumNum).equals(Integer.toString(reverseSumNum))) {
				System.out.println("YES");
			}
			else System.out.println("NO");
		}
		sc.close();
    }
}
