import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	// 여름일수 
		int t = sc.nextInt();	// 성장소요일
		int c = sc.nextInt();	// 심을수 있는 칸의 수 
		int p = sc.nextInt();	// 개당 가격 

		int cnt = 0;	// 몇번 심을 수 있는가?

		if(n % t == 0) cnt = n/t - 1;
		else cnt = n/t;

		int money = cnt * c * p;
		System.out.println(money);
    	sc.close();
    }
}