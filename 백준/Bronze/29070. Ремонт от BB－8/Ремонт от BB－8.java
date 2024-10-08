import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();

		int x = (int)Math.ceil((double)h / a);
		int y = (int)Math.ceil((double)w / b);

		System.out.println(x * y);
		sc.close();
    }
}
