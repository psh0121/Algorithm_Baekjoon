import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long m = sc.nextLong();
		long result = 1;

		for(int i = 0; i < n; i++) {
			long a = sc.nextLong();

			result = (result * (a % m)) % m;
		}

		System.out.println(result);
		sc.close();
    }
}