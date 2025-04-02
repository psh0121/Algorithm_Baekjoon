import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();
		int a = sc.nextInt();

		int diff = Math.abs(l - r);

		if(diff > a) {
			if(l < r) l += a;
			else r += a;

			a = 0;
			l = r = Math.min(l, r);
		}
		else {
			if(l < r) l += diff;
			else r += diff;

			a -= diff;

			l += a / 2;
			r += a / 2;
		}

		System.out.println(l + r);
		sc.close();
    }
}