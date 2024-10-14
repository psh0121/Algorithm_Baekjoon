import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int f = sc.nextInt();

		int twozeroN = Integer.parseInt(n.substring(0, n.length() - 2) + "00");
		int modValue = twozeroN % f;

		if(modValue == 0) System.out.println("00");
		else {
			int twoNum = f - modValue;

			if(twoNum < 10) {
				System.out.println("0" + twoNum);
			}
			else {
				System.out.println(twoNum);
			}
		}
		sc.close();
    }
}
