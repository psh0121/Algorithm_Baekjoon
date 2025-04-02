import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		int kind = 1;
		int bad = 1;

		for(int i = 1; i <= n; i++) {
			kind += a;
			bad += b;

			if(kind < bad) {
				int temp = kind;

				kind = bad;
				bad = temp;
			}
			else if (kind == bad) {
				bad--;
			}
		}

		System.out.println(kind + " " + bad);
		sc.close();
    }
}
