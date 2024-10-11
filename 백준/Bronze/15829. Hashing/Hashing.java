import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		String str = sc.next();

		long m = 1234567891;
		long r = 31;

		long hashValue = 0;
		long pow = 1;

		for(int i = 0; i < l; i++) {
			int value = str.charAt(i) - 'a' + 1;
			hashValue = (hashValue + value * pow) % m;
			pow = (pow * r) % m;
		}

		System.out.println(hashValue);
		sc.close();
    }
}
