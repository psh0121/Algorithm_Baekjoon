import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for(int i = 0; i < t; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			int n = sc.nextInt();	// 로라 앞에 번호
			int m = sc.nextInt();	// 찾으려는 번호

			int diff = Math.abs(m - n);

			if(diff > l) System.out.println("R");
			else if(diff > r) System.out.println("L");
			else if(diff == 0) System.out.println("G");
			else System.out.println("E");
		}
		sc.close();
    }
}
