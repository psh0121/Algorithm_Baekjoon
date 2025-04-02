import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[] wall = new int[m+1];

		for(int i = 0; i < n; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();

			for(int j = l; j <= r; j++) {
				wall[j]++;
			}
		}

		for(int i = 1; i < wall.length; i++) {
			if(wall[i] == 0) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
		sc.close();
    }
}
