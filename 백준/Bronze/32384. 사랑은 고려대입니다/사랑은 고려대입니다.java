import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = "LoveisKoreaUniversity ".repeat(n);
		System.out.println(str.trim());
		sc.close();
    }
}
