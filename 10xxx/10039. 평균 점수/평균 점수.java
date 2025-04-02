import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int cnt = 0;
		
		int score;
		
		while(sc.hasNext()) {
			score = sc.nextInt();
			cnt++;
			
			if(score < 40) score = 40;
			sum += score;
		}
		
		System.out.println(sum / cnt);
	}
}         
