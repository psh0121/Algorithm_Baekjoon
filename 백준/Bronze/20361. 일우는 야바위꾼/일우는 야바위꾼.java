import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int k = sc.nextInt();

		int[] cups = new int[n + 1];
		cups[x] = 1;

		for(int i = 0; i < k; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			int temp = cups[a];

			cups[a] = cups[b];
			cups[b] = temp;
		}

		for(int i = 0; i < cups.length; i++) {
			if(cups[i] == 1) {
				System.out.println(i);
				break;
			}
		}
    	sc.close();
    }
}