import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();	// division1
		int p = sc.nextInt();	// division2
		int c = sc.nextInt();	// shake!

		System.out.println(Math.max(a + c, p));

    	sc.close();
    }
}