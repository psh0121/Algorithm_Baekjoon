import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		
		int[] songTime = new int[n];
		for(int i = 0; i < n; i++) songTime[i] = sc.nextInt();

		int[] startTime = new int[n];
		int[] endTime = new int[n];

		for(int i = 0; i < n; i++) {
			if(i == 0) {
				endTime[i] = songTime[i] - 1;
			}
			else {
				startTime[i] = endTime[i-1] + 1;
				endTime[i] = startTime[i] + songTime[i] - 1;
			}
		}

		for(int i = 0; i < q; i++) {
			int song = sc.nextInt();

			for(int j = 0; j < n; j++) {
				int start = startTime[j];
				int end = endTime[j];

				if(song >= start && song <= end) System.out.println(j+1);
			}
		}
		sc.close();
    }
}
