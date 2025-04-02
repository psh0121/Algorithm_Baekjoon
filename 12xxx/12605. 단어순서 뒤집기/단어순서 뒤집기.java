import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());

		for(int i = 1; i <= n; i++) {
			String[] arr = sc.nextLine().split(" ");
			
			System.out.print("Case #" + i + ": ");
			for(int j = arr.length - 1; j >= 0; j--) {
				System.out.print(arr[j]);

				if(j != 0) System.out.print(" ");
			}

			System.out.println();
		}
		sc.close();
    }
}
