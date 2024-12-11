import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			String value = sc.next();
			if(value.equals("P=NP")) {
				System.out.println("skipped");
			}
			else {
				String[] arr = value.split("\\+");
				int a = Integer.parseInt(arr[0]);
				int b = Integer.parseInt(arr[1]);
				System.out.println(a + b);
			}
		}

		sc.close();
    }
}
