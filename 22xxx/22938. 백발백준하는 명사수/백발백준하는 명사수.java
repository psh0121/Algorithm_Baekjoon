import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int r1 = sc.nextInt();

		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int r2 = sc.nextInt();

		if(1l * (x1 - x2) * (x1 - x2) + 1l * (y1 - y2) * (y1 - y2) < 1l * (r1 + r2) * (r1 + r2)) System.out.println("YES");
		else System.out.println("NO");

		sc.close();
    }
}