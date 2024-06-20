import java.util.Scanner;

public class Main {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		// 하루1번 A개 코인
		// 연속ㅊㅊ시 B 보너스 코인
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int day7 = a * 7 + b;

		if(b == 0) {
			System.out.println((int)Math.ceil((double)c / a));
		}
		else if(c / day7 >= 1) {
			int week = c / day7;
			int day = c % day7;

			System.out.println(week * 7 + day);
		}
		else {
			System.out.println((int)Math.ceil((double)c / a));
		}
		sc.close();
    }
}