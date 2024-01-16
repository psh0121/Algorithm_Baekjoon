import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int noDriveNum = Integer.parseInt(sc.nextLine());
		String[] strArr = sc.nextLine().split(" ");
		
		int[] arr = new int[strArr.length];
		for(int i = 0; i < arr.length; i++) arr[i] = Integer.parseInt(strArr[i]);
		
		int cnt = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 10 == noDriveNum) cnt++;
		}
		
		System.out.println(cnt);
	}
}         
