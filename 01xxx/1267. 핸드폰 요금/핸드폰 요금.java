import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ys = 0;
		int ms = 0;
		
		for(int i = 0; i < n; i++) {
			double call = sc.nextDouble();
			
			ys += Math.ceil(call / 30) * 10;
			ms += Math.ceil(call / 60) * 15;
			
			if(call % 30 == 0) ys += 10;
			if(call % 60 == 0) ms += 15;
		}
		
		if(ys < ms) System.out.println("Y " + ys);
		else if (ys == ms) System.out.println("Y M " + ys);
		else System.out.println("M " + ms);
	}
}