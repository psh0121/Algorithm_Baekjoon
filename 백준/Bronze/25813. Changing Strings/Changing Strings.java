import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		int idxU = str.indexOf("U");
		int lastIdxF = str.lastIndexOf("F");

		for(int i = 0; i < str.length(); i++) {
			if(i < idxU) System.out.print("-");
			else if (i == idxU) System.out.print("U");
			else if (i > idxU && i < lastIdxF) System.out.print("C");
			else if (i == lastIdxF) System.out.print("F");
			else System.out.print("-");
		}
		sc.close(); 
    }
}
