import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int cnt = 0;

		for(int i = 1; i < n; i++) {
			if(Integer.toString(i).contains("50")) cnt += 2;
			else cnt++;
		}
		cnt++;

		System.out.println(cnt);
		sc.close();
    }
}