import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int d1 = sc.nextInt();
		int d2 = sc.nextInt();

		System.out.println(k * k - ((double)(d1 - d2) / 2) * ((double)(d1 - d2) / 2));
		
		sc.close();
    }
}