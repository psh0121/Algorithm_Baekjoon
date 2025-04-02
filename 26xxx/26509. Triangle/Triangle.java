import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			int[] tri1 = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
			int[] tri2 = {sc.nextInt(), sc.nextInt(), sc.nextInt()};

			Arrays.sort(tri1);
			Arrays.sort(tri2);

			if(tri1[0] == tri2[0] && tri1[1] == tri2[1] && tri1[2] == tri2[2]) {
				if(tri1[0] * tri1[0] + tri1[1] * tri1[1] == tri1[2] * tri1[2]) System.out.println("YES"); 
				else System.out.println("NO");
			}
			else System.out.println("NO");
		}
		sc.close();
    }
}
