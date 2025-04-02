import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] b = new int[n];
		for(int i = 0; i < n; i++) b[i] = sc.nextInt();

		int[] a = new int[n];
		long beforeValue = b[0];
		for(int i = 0; i < n; i++) {
			if(i == 0) {
				a[i] = b[i];
				continue;
			}

			long value = 1l * b[i] * (i + 1) - beforeValue;
			a[i] = (int)value;
			beforeValue += value;
		}

		for(int i = 0; i < n; i++) {
			if(i == n-1) System.out.println(a[i]);
			else {
				System.out.print(a[i] + " ");
			}
		}

		sc.close();
    }
}
