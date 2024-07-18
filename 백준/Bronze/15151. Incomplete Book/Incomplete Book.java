import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// k: 첫 소설 완성일수
		// d: 첫 소설을 쓰기 시작한 후 죽을때 까지 날 수 
		long k = sc.nextLong();
		long d = sc.nextLong();

		long result = 0;

		while (d >= k) {
			d -= k;
			k *= 2;

			result++;
		}

		System.out.println(result);
		sc.close();
    }
}
