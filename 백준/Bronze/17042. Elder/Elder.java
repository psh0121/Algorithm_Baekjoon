import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String master = sc.next();
		int n = sc.nextInt();

		String beforeMaster = master;

		for(int i = 0; i < n; i++) {
			String win = sc.next();
			String loose = sc.next();

			if(loose.equals(master)) {
				if(!beforeMaster.contains(win)) beforeMaster += win;
				master = win;
			}
		}

		System.out.println(master);
		System.out.println(beforeMaster.length());
		sc.close(); 
    }
}
