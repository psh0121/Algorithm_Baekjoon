import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int[] attendanceArr = new int[30];
		
		for(int i = 0; i < 30; i++) attendanceArr[i] = i+1;
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			attendanceArr[sc.nextInt()-1] = 0;
		}
		
		for(int i = 0; i < attendanceArr.length; i++) {
			if(attendanceArr[i] != 0) System.out.println(attendanceArr[i]);
		}
	}

}