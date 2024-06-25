import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		String turn = "yt";

		while (true) {
			if (turn.equals("yt")) {
				b += a;
				turn = "yj";
			}
			else {
				a += b;
				turn = "yt";
			}

			if(a >= 5) {
				System.out.println("yj");
				break;
			}
			else if (b >= 5) {
				System.out.println("yt");
				break;
			}
		}
		sc.close();
    }
}