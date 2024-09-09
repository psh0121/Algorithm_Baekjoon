import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();

		int maxCnt = 1;
		int curCnt = 1;

		for(int i = 0; i < arr.length - 1; i++) {

			if(arr[i] < arr[i+1]) curCnt++;
			else {
				maxCnt = Math.max(maxCnt, curCnt);
				curCnt = 1;
			}
		}

		maxCnt = Math.max(maxCnt, curCnt);

		System.out.println(maxCnt);
		sc.close();
    }
}
