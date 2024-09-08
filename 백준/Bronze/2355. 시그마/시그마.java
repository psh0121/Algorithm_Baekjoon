import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();

		if(a > b) {
			long temp = a;
			a = b;
			b = temp;
		}

		// 등차수열 : n/2 * (a + l)
		long sum  = (b - a + 1) * (a + b) / 2;
		System.out.println(sum);
		sc.close();
    }
}
