import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		
		String number;
		double[] passGrade = {35 * 0.3, 25 * 0.3, 40 * 0.3};
		double[] myGrade = new double[3];
		int sum = 0;
		String result;
		
		for(int i = 0; i < cnt; i++) {
			number = sc.next();
			result = "";
			
			myGrade[0] = sc.nextDouble();
			myGrade[1] = sc.nextDouble();
			myGrade[2] = sc.nextDouble();
			
			sum = (int)(myGrade[0] + myGrade[1] + myGrade[2]);
			
			if(sum < 55) result = "FAIL";
			else {
				for(int j = 0; j < passGrade.length; j++) {
					if(passGrade[j] > myGrade[j]) {
						result = "FAIL";
						break;
					}
				}
				
				if(result.length() == 0) result = "PASS";
			}
			
			System.out.println(number + " " + sum + " " + result);
		}
	}
}         
