import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = sc.next().split("");
		
		int b = 0;
		int s = 0;
		int a = 0;
		
		for(int i = 0; i < n; i++) {
			switch(arr[i]) {
			case "B":
				b++;
				break;
			case "S":
				s++;
				break;
			default:
				a++;
				break;
			}
		}
		
		int maxCnt = Math.max(Math.max(b, s), a);
		String result = "";
		
		if(maxCnt == b) result += "B";
		if(maxCnt == s) result += "S";
		if(maxCnt == a) result += "A";
		
		System.out.println(result.length() == 3 ? "SCU" : result);
	}
}

