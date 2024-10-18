import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long cnt = (long) n * (n-1) * (n-2) / 6;
		int res = 3;

		System.out.println(cnt);
		System.out.println(res);
		sc.close();
    }
}
