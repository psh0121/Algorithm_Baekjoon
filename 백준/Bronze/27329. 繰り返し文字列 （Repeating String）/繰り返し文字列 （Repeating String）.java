import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();

		if(str.substring(0, n/2).equals(str.substring(n/2, n))) System.out.println("Yes");
		else System.out.println("No");
		sc.close(); 
    }
}
