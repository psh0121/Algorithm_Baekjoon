import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		StringBuffer sb;
		String reverseStr;
		
		for(int i = 0; i < row; i++) {
			while(sc.hasNext()) {
				sb = new StringBuffer(sc.next());
				reverseStr = sb.reverse().toString();
				
				System.out.println(reverseStr);
			}
		}
	}
}         
