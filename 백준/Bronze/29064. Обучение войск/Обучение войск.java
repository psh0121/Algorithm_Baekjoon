import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int needCnt = (int)Math.ceil((double)n / 2);

		for(int i = 0; i < n; i++) {
			int num = sc.nextInt();

			if(num == 1) needCnt--;
		}

		System.out.println(needCnt < 0 ? 0 : needCnt);
		sc.close();
    }
}
