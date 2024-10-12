import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int shoot = sc.nextInt();
		int foul = sc.nextInt();

		int grade = 0;

		if(shoot == 1 && foul == 1) {
			grade = x;
			grade += sc.nextInt();
		}
		else if(shoot == 1 && foul == 0) grade = x;
		else if(shoot == 0 && foul == 1) {
			for(int i = 0; i < x; i++) grade += sc.nextInt();
		}
		else grade = 0;

		System.out.println(grade);
		sc.close();
    }
}
