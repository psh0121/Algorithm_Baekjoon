import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int[] start = {11, 11, 11};
		int[] end = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
		
		int[] cal = new int[3];
		
		if(end[2] - start[2] < 0) {
			cal[2] = (60 + end[2]) - start[2];
			end[1]--;
		}
		else cal[2] = end[2] - start[2];
		
		if(end[1] - start[1] < 0) {
			cal[1] = (24 + end[1]) - start[1];
			end[0]--;
		}
		else cal[1] = end[1] - start[1];
		
		cal[0] = end[0] - start[0];
		
		if(cal[0] < 0) System.out.println(-1);
		
		else System.out.println(cal[0] * 1440 + cal[1] * 60 + cal[2]);
	}
}         
