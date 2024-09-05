import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for(int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			// a의 마지막 자릿수 파악 => 마지막수 반복을 파악하기 위해
			a %= 10;

			// a의 값일 경우 반복수를 배열안에 넣어주도록 한다.
			int[] lastDigits;
			if(a == 0) lastDigits = new int[]{0};
			else if(a == 1) lastDigits = new int[]{1};
			else if(a == 2) lastDigits = new int[]{2, 4, 8, 6};
			else if(a == 3) lastDigits = new int[]{3, 9, 7, 1};
			else if(a == 4) lastDigits = new int[]{4, 6};
			else if(a == 5) lastDigits = new int[]{5};
			else if(a == 6) lastDigits = new int[]{6};
			else if(a == 7) lastDigits = new int[]{7, 9, 3, 1};
			else if(a == 8) lastDigits = new int[]{8, 4, 2, 6};
			else lastDigits = new int[]{9, 1};

			// 주기 길이
			int cycleLen = lastDigits.length;

			// 배열의 인덱스가 0부터 시작되는 것을 고려해 b-1로 계산한다.
			int idx = (b - 1) % cycleLen;
			int result = lastDigits[idx];

			System.out.println(result == 0 ? 10 : result);
		}
		sc.close();
    }
}
