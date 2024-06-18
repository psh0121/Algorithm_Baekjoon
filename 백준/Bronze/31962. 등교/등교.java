import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		
		// X분 이내로 도착, N개의 버스중 하나 선택
		// 최대한 버스 늦게탈거임

		int n = sc.nextInt();
		int x = sc.nextInt();

		int startTime = 0;

		for(int i = 0; i < n; i++) {
			int s = sc.nextInt();
			int t = sc.nextInt();

			if(s+t > x) continue;

			if(startTime < s) startTime = s;
		}

		System.out.println(startTime == 0 ? -1 : startTime);
		sc.close();
    }
}