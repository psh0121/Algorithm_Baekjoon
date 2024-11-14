import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int m = sc.nextInt();

		int fatigue = 0;
		int work = 0;

		for(int i = 1; i <= 24; i++) {
			if(fatigue <= m-a) {
				fatigue += a;
				work += b;
			}
			else {
				fatigue -= c;
				if(fatigue < 0) fatigue = 0;
			}
		}

		System.out.println(work);
		sc.close();
    }
}
