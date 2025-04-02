import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == -1) continue;
			
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j] == -1) continue;
				
				if(arr[i] == arr[j]) {
					arr[i] = -1;
					arr[j] = -1;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != -1) {
				System.out.println(arr[i]);
				break;
			}
		}
	}
}         