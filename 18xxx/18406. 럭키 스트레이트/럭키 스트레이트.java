import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int len = str.length();
		int sumA = 0;
		int sumB = 0;

		for(int i = 0; i < len/2; i++) {
			sumA += str.charAt(i) - '0';
			sumB += str.charAt(i + (len/2)) - '0';
		}
        
		System.out.println(sumA == sumB ? "LUCKY" : "READY");
		sc.close();
    }
}
