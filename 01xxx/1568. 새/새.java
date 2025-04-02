import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 1;
		int sec = 0;

		while (true) {
			n -= k;
			k++;
			sec++;

			if(k > n) k = 1;
			if(n == 0) break;
		}

		System.out.println(sec);
		sc.close();
    }
}
