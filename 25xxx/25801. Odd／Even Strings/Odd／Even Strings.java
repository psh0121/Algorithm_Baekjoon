import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = sc.next().split("");

		int odd = 0;
		int even = 0;

		for(int i = 0; i < arr.length; i++) {
			int cnt = 0;

			for(int j = 0; j < arr.length; j++) {
				if(arr[i].equals(arr[j])) cnt++;
			}

			if(cnt % 2 == 1) odd++;
			else even++;
		}

		if(odd != 0 && even == 0) System.out.println("1");
		else if(odd != 0 && even != 0) System.out.println("0/1");
		else System.out.println("0");
		sc.close();
    }
}
