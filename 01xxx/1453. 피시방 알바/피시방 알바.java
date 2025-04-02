import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[101];
		int cnt = 0;
		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			int num = sc.nextInt();

			if(arr[num] == 0) arr[num] = 1;
			else cnt++;
		}
		System.out.println(cnt);
		sc.close();
    }
}
