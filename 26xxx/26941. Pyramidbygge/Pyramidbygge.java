import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long floor = 0;
		long cnt = 0;
		long base = 1;

		while (true) {
			floor++;
			cnt += base * base;

			if(cnt > n) {
				break;
			}

			base += 2;
		}

		System.out.println(floor -1);
		sc.close();
    }
}
