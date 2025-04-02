import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		
		for(int i = 0; i < cnt; i++) {
			String walking = sc.next();
			int walk = 0;
			
			for(int j = 0; j < walking.length(); j++) {
				if(Character.toString(walking.charAt(j)).equals("D")) break;
				
				walk++;
			}
			
			System.out.println(walk);
		}
	}
}         