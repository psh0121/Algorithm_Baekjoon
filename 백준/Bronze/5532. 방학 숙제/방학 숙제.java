import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		double vacation = sc.nextInt();
		double kor = sc.nextInt();
		double math = sc.nextInt();
		double maxKor = sc.nextInt();
		double maxMath = sc.nextInt();
		
		double homework = Math.max(Math.ceil(kor / maxKor), Math.ceil(math / maxMath));
		
		System.out.println((int)(vacation - homework));
	}
}         
