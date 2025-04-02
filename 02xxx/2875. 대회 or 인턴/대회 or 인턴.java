import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int girl = sc.nextInt();
		int boy = sc.nextInt();
		int intern = sc.nextInt();
		
		int curTeam = Math.min(girl / 2, boy);
		girl = girl - (curTeam * 2);
		boy = boy - curTeam;
		
		while(intern > 0) {
			if(girl == 0 && boy == 0) {
				curTeam --;
				girl += 2;
				boy ++;
			}
			
			intern -= girl;
			intern -= boy;
			girl = 0;
			boy = 0;
		}
		
		System.out.println(curTeam);
	}
}

