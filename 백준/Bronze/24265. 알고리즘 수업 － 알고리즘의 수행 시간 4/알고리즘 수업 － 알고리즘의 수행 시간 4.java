import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		long cnt = (long)n * (n-1) / 2;

		System.out.println(cnt);
		System.out.println(2);
    	sc.close();
    }
}