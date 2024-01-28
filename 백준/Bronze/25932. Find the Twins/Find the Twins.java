import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int cnt = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < cnt; i++) {
			String str = sc.nextLine();
			boolean zack = str.contains("17");
			boolean mack = str.contains("18");
			
			System.out.println(str);
			
			if(zack == true && mack == true) System.out.println("both");
			else if(zack == true) System.out.println("zack");
			else if(mack == true) System.out.println("mack");
			else System.out.println("none");
			
			System.out.println();
		}
	}
}