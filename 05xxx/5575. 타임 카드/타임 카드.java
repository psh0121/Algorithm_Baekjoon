import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String[] start = new String[3];
		String[] end = new String[3];
		int[] result = new int[3];
		
		for(int i = 0; i < 3; i++) {
			start[0] = sc.next();
			start[1] = sc.next();
			start[2] = sc.next();
			
			end[0] = sc.next();
			end[1] = sc.next();
			end[2] = sc.next();
			
			if(Integer.parseInt(end[2]) - Integer.parseInt(start[2]) < 0) {
				result[2] = (60 + Integer.parseInt(end[2]) - Integer.parseInt(start[2]));
				end[1] = "" + (Integer.parseInt(end[1]) - 1);
			}
			else result[2] = Integer.parseInt(end[2]) - Integer.parseInt(start[2]);
			
			if(Integer.parseInt(end[1]) - Integer.parseInt(start[1]) < 0) {
				result[1] = (60 + Integer.parseInt(end[1]) - Integer.parseInt(start[1]));
				end[0] = "" + (Integer.parseInt(end[0]) - 1);
			}
			else result[1] = Integer.parseInt(end[1]) - Integer.parseInt(start[1]);
			
			result[0] = Integer.parseInt(end[0]) - Integer.parseInt(start[0]);
			
			System.out.println("" + result[0] + " " + result[1] + " " + result[2]);
		}
	}
}         
