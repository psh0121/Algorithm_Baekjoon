import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		int cnt0 = 0;
		int cnt1 = 0;
		
		for(int i = 0; i < h; i++) {
			String bubble = sc.next();
			
			for(int j = 0; j < w; j++) {
				if(bubble.charAt(j) == '0') cnt0++;
				else cnt1++;
			}
		}
		
		System.out.println(Math.min(cnt0, cnt1));
		
	}
}         
