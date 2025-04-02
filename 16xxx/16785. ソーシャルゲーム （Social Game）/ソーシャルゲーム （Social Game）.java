import java.util.Scanner;

public class Main {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		// 하루1번 A개 코인
		// 연속ㅊㅊ시 B 보너스 코인
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int days = 0;
		int totalCoins = 0;

		while (totalCoins < c) {
			totalCoins += a;
			days++;

			if(days % 7 == 0) totalCoins += b;
		}

		System.out.println(days);
		sc.close();
    }
}