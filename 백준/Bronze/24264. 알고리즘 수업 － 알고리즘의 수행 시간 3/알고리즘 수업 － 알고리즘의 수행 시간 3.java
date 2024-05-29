import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long powN = (long) n * n;
		System.out.printf("%d\n%d", powN, 2);
    	sc.close();
    }
}