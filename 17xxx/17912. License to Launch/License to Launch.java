import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] arr = sc.nextLine().split(" ");

		int minNum = Integer.MAX_VALUE;
		int day = 0;
		
		for(int i = 0; i < n; i++) {
			if(Integer.parseInt(arr[i]) < minNum) {
				minNum = Integer.parseInt(arr[i]);
				day = i;
			}
		}

		System.out.println(day);
		sc.close();
    }
}