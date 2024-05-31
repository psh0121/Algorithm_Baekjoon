import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();	// 수집기간
		int k = sc.nextInt();	// 애착정도
		int p = sc.nextInt();	// 구매중독정도

		int totalCnt = 0;

		for(int i = 1; i <= c; i++) {
			totalCnt += (k * i) + (p * (i * i));
		}

		System.out.println(totalCnt);
    	sc.close();
    }
}