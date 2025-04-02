import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int cnt;
		String[] strArr;
		double[] doubleArr;
		
		int caseNum = 1;
		
		while(sc.hasNextLine()) {
			cnt = sc.nextInt();
			if(cnt == 0) break;
			
			strArr = sc.nextLine().split(" ");
			
			doubleArr = new double[strArr.length];
			for(int i = 1; i < doubleArr.length; i++) {
				doubleArr[i] = Double.parseDouble(strArr[i]);
			}
			
			if(cnt % 2 == 1) {
				System.out.println("Case " + caseNum++ + ": " + doubleArr[(cnt + 1) / 2]);
			}
			else {
				System.out.println("Case " + caseNum++ + ": " + String.format("%.1f", (doubleArr[cnt / 2] + doubleArr[(cnt / 2) + 1]) / 2));
			}
		}
	}
}         
