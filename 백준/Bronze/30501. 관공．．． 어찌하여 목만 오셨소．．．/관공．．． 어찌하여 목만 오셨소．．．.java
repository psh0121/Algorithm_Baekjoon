import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		String name = "";
		boolean trueFlag = false;
		
		for(int i = 0; i < cnt; i++) {
			name = sc.next();
			
			for(int j = 0; j < name.length(); j++) {
				if(name.charAt(j) == 'S') {
					trueFlag = true;
					break;
				}
			}
			
			if(trueFlag) break;
		}
		
		System.out.println(name);
	}
}         
