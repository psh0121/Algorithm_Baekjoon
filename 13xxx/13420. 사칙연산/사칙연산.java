import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < n; i++) {
			String value = sc.nextLine();
			String[] arr = value.split(" ");
			long a = Long.parseLong(arr[0]);
			long b = Long.parseLong(arr[2]);
			long c = Long.parseLong(arr[4]);

			if(arr[1].equals("+")) System.out.println(a + b == c ? "correct" : "wrong answer ");
			else if(arr[1].equals("-")) System.out.println(a - b == c ? "correct" : "wrong answer ");
			else if(arr[1].equals("*")) System.out.println(a * b == c ? "correct" : "wrong answer ");
			else System.out.println(a / b == c ? "correct" : "wrong answer ");
		}
		sc.close();
    }
}
