import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int v1 = n * a;
		int v2 = m * b;
		int v3 = k * c;

		int maxValue = Math.max(v1, v2);
		maxValue = Math.max(maxValue, v3);

		if(v1 == maxValue) System.out.print("Joffrey ");
		if(v2 == maxValue) System.out.print("Robb ");
		if(v3 == maxValue) System.out.print("Stannis");
		sc.close(); 
    }
}
