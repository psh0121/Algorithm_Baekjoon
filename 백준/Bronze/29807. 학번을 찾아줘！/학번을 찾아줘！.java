import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[] arr = {0, 0, 0, 0, 0};
		
		for(int i = 0; i < cnt; i++) arr[i] = sc.nextInt();
		
		long grade1, grade2, grade3;
		
		if(arr[0] > arr[2]) grade1 = Math.abs(arr[0]-arr[2]) * 508;
		else grade1 = Math.abs(arr[0]-arr[2]) * 108;
		
		if(arr[1] > arr[3]) grade2 = Math.abs(arr[1]-arr[3]) * 212;
		else grade2 = Math.abs(arr[1]-arr[3]) * 305;
		
		grade3 = arr[4] * 707;
		
		System.out.println((grade1 + grade2 + grade3) * 4763);
	}
}         