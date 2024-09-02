import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int curTem = sc.nextInt();
		int hopeTem = sc.nextInt();
		String mode = sc.next();

		if(mode.equals("auto")) {
			System.out.println(hopeTem);
		}
		else if (mode.equals("fan")) {
			System.out.println(curTem);
		}
		else if (mode.equals("freeze")) {
			if (curTem < hopeTem) System.out.println(curTem);
			else System.out.println(hopeTem);
		}
		else if (mode.equals("heat")) {
			if (curTem > hopeTem) System.out.println(curTem);
			else System.out.println(hopeTem);
		}
        sc.close();
    }
}
