import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int a = 0;
		int b = 0;

		String result = "yes";

		for(int i = 0; i < n; i++) {
			if(i == 0) {
				a = sc.nextInt();
				b = sc.nextInt();

				continue;
			}

			int curA = sc.nextInt();
			int curB = sc.nextInt();

			if(curA < a || curB < b) {
				result = "no";
				break;
			}

			a = curA;
			b = curB;
		}

		System.out.println(result);
        sc.close();
    }
}
