import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();		// 고기온도 
		int b = sc.nextInt();		// 목표온도 
		int c = sc.nextInt();		// 얼어있는 고기 1도 올리는데 걸리는 시간 
		int d = sc.nextInt();		// 얼어있는 고기 해동하는데 걸리는 시간 
		int e = sc.nextInt();		// 안얼어있는 고기 1도 올리는데 걸리는 시간 
		
		int time = 0;
		
		if(a < 0) {
			time += Math.abs(a) * c;
			time += d;
			time += b * e;
		}
		else if(a == 0) {
			time += d;
			time += b * e;
		}
		else time += (b - a) * e;
			
		System.out.println(time);
		
		sc.close();
	}
}         
