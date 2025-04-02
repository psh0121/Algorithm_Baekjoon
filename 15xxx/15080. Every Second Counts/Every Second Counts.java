import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String[] strStart = sc.nextLine().split(" : ");
		String[] strEnd = sc.nextLine().split(" : ");
		int[] start = new int[3];
		int[] end = new int[3];
		
		for(int i = 0; i < 3; i++) {
			start[i] = Integer.parseInt(strStart[i]);
			end[i] = Integer.parseInt(strEnd[i]);
		}
		
		
		if(end[0] < start[0]) end[0] += 24;
		
		int[] time = new int[3];
		
		if(end[2] - start[2] < 0) {
			time[2] = 60 + end[2] - start[2];
			end[1]--;
		}
		else time[2] = end[2] - start[2];
		
		if(end[1] - start[1] < 0) {
			time[1] = 60 + end[1] - start[1];
			end[0]--;
		}
		else time[1] = end[1] - start[1];
		
		time[0] = end[0] - start[0];
		
		if(time[0] < 0) time[0] += 24;
		
		int result = time[0] * 3600 + time[1] * 60 + time[2];
		
		System.out.println(result);
		
		sc.close();
	}
}         
