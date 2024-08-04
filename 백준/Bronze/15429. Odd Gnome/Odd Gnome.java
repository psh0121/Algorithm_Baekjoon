import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			int g = sc.nextInt();

			int[] gnomes = new int[g];

			for(int j = 0; j < g; j++) {
				gnomes[j] = sc.nextInt();
			}

			for(int j = 1; j < g; j++) {	
				if(gnomes[j] - gnomes[j-1] != 1) {
					System.out.println(j + 1);
					break;
				}
			}
		}
		sc.close(); 
    }
}
