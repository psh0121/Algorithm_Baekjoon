import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[] money = new int[2];
		
		int sum = 0;
		
		for(int i = 0; i < cnt; i++) {
			money[0] = sc.nextInt();
			money[1] = sc.nextInt();
			
			switch(money[0]) {
			case 136:
				sum += 1000;
				break;
			case 142:
				sum += 5000;
				break;
			case 148:
				sum += 10000;
				break;
			default:
				sum += 50000;
				break;
			}
		}
		
		System.out.println(sum);
		sc.close();
	}
}         
