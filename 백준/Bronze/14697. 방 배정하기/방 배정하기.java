import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int n = sc.nextInt();

		n %= c;

		if(n == 0){
			System.out.println(1);
			return;
		} 

		n %= b;

		if(n == 0){
			System.out.println(1);
			return;
		} 

		n %= a;

		if(n == 0){
			System.out.println(1);
			return;
		} 

		System.out.println(0);

		sc.close();
    }
}
