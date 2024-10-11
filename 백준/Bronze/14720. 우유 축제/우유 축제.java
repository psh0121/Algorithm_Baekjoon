import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int milk = 0;
		int cnt = 0;

		for(int i = 0; i < n; i++) {
			int store = sc.nextInt();

			if(store == milk) {
				if(milk == 0) {
					cnt++;
					milk = 1;
				}
				else if (milk == 1) {
					cnt++;
					milk = 2;
				}
				else if (milk == 2) {
					cnt++;
					milk = 0;
				}
			}
		}
		System.out.println(cnt);
		sc.close();
    }
}
