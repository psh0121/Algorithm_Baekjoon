import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int possibleK = 0;	

		// 각 콘센트에서 꽂을 수 있는 구멍의 개수를 파악해 possibleK에 넣고난 뒤
		// n과 비교하여 yes or no 를 판단하도록 한다.
		for(int i = 0; i < k; i++) {
			possibleK += Math.ceil(sc.nextDouble() / 2);
		}

		System.out.println(possibleK >= n ? "YES" : "NO");
    	sc.close();
    }
}