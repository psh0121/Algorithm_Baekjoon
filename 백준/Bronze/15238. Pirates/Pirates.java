import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int[] alphaArr = new int[26];

		for(int i = 0; i < n; i++) {
			char alpha = s.charAt(i);
			alphaArr[(int)alpha - 97]++;
		}

		// 가장 많이 나온 알파벳 추론 
		int maxCnt = Integer.MIN_VALUE;
		int maxIdx = 0;

		for(int i = 0; i < alphaArr.length; i++) {
			if(alphaArr[i] > maxCnt) {
				maxCnt = alphaArr[i];
				maxIdx = i;
			}
		}

		System.out.println(((char)(maxIdx + 97)) + " " + maxCnt);
		
		sc.close();
    }
}