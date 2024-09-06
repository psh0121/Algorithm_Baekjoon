import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int waiting = 0;
		int seat = 0;

		for(int i = 0; i < n; i++) {
			int group = sc.nextInt();
			if(seat + group <= m) {
				seat += group;
			}
			else {
				waiting++;
				seat = group;
			}
			System.out.println(waiting);
		}
		sc.close();
    }
}
