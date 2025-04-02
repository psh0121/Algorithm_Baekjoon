import java.util.Scanner;

public class Main {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();

		int[] arr = new int[n+1];
		for(int i = 1; i <= n; i++) arr[i] = sc.nextInt();

		boolean breakFlag = false;
		while (!breakFlag) {
			for(int i = 1; i <= n; i++) {
				if(arr[i] < x) {
					System.out.println(i);
					breakFlag = true;
					break;
				}
				
				x++;
			}
		}
		sc.close();
    }
}