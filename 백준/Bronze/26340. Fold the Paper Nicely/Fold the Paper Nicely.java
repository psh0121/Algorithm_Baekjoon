import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int w, h;
		int count;
		
		for(int i = 0; i < n; i++) {
			w = sc.nextInt();
			h = sc.nextInt();
			count = sc.nextInt();
			System.out.println("Data set: " + w + " " + h + " " + count);
			
			int fw = w;
			int fh = h;
			
			for(int j = 0; j < count; j++) {
				if(fw > fh) fw /= 2;
				else fh /= 2;
			}
			
			System.out.println(Math.max(fw, fh) + " " + Math.min(fw, fh));
			System.out.println();
		}
	}
}         