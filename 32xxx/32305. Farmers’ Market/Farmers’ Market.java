import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int d = sc.nextInt();

		int val = (a * b) / 12;
		if((a*b) % 12 != 0) val++;

		System.out.println(val * d);
		sc.close();
    }
}
