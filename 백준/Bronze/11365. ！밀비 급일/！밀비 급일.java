import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String str;
		StringBuffer sb;
		
		while(sc.hasNext()) {
			str = sc.nextLine();
			
			if(str.equals("END")) break;
			
			sb = new StringBuffer(str);
			System.out.println(sb.reverse().toString());
		}
	}
}         
