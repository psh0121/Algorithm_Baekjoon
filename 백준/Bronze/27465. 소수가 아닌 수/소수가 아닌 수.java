import java.util.Scanner;

public class Main {

	public static long nextNotPrime(long n) {
		long num = n;
		if(num % 2 == 0) num += 2;

		return num;
	}
	
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();

		if(n == 2 || n == 1) {
			System.out.println(4);
			return;
		}

		System.out.println(nextNotPrime(n));
		sc.close();
    }
}