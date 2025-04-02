import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		// x = 1부터 n까지 일정간격 레몬나무
		// 성우위치 0 , 집 위치 n+1
		// 채집 - 나무 모두따기 (max 1)
		// 이동 - 내 위치 +1하기
		int n = sc.nextInt();
		int[] lemon = new int[n + 1];
		for(int i = 1; i <= n; i++) lemon[i] = sc.nextInt();

		int[] getLemon = new int[n + 1];
		for(int i = 1; i <= n; i++) {
			getLemon[i] = lemon[i] - Math.abs((n+1) - i);
		}

		Arrays.sort(getLemon);

		System.out.println(getLemon[n]);
		sc.close();
    }
}