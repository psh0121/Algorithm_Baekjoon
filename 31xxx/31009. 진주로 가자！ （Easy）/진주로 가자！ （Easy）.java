import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] nameArr = new String[n];
		int[] feeArr = new int[n];
		
		int jjFee = 0;
		int jjIdx = 0;
		int cnt = 0;
		
		for(int i = 0; i < n; i++) {
			nameArr[i] = sc.next();
			feeArr[i] = sc.nextInt();
			
			if(nameArr[i].equals("jinju")) {
				jjFee = feeArr[i];
				jjIdx = i;
			}
		}
		
		for(int i = 0; i < n; i++) {
			if(feeArr[i] > jjFee) cnt++;
		}
		
		System.out.println(jjFee);
		System.out.println(cnt);
	}
}

