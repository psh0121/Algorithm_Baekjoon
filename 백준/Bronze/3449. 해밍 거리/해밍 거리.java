import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for(int i = 0; i < t; i++) {
			String n1 = sc.next();
			String n2 = sc.next();

			int cnt = 0;

			for(int j = 0; j < n1.length(); j++) {
				if(n1.charAt(j) != n2.charAt(j)) cnt++;
			}

			System.out.println("Hamming distance is " + cnt + ".");
		}
		sc.close();
    }
}
