import java.util.Scanner;

public class Main {

	public static int fibo(int num) {
		if(num == 0 || num == 1) {
			return num;
		}

		return fibo(num - 1) + fibo(num - 2);
	}
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int result = fibo(num);

		System.out.println(result);
		sc.close();
    }
}
