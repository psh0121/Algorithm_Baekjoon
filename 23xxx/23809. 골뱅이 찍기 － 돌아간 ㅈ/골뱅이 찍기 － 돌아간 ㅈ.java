import java.util.Scanner;

public class Main {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.print(("@".repeat(n) + " ".repeat(n*5 - n - n) + "@".repeat(n) + "\n").repeat(n));
		System.out.print(("@".repeat(n) + " ".repeat(n*5 - n - n - n) + "@".repeat(n) + "\n").repeat(n));
		System.out.print(("@".repeat(n*3) + "\n").repeat(n));
		System.out.print(("@".repeat(n) + " ".repeat(n*5 - n - n - n) + "@".repeat(n) + "\n").repeat(n));
		System.out.print(("@".repeat(n) + " ".repeat(n*5 - n - n) + "@".repeat(n) + "\n").repeat(n));
		sc.close();
    }
}