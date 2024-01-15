import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		String[] valArr = "9780921418".split("");
		int[] num = {1, 3};
		int sum = 0;
		
		for(int i = 0; i < valArr.length; i++) {
			sum += Integer.parseInt(valArr[i]) * num[i % 2];
		}
		
		Scanner sc = new Scanner(System.in);
		int oneThreeCalVal = sc.nextInt() * 1 + sc.nextInt() * 3 + sc.nextInt() * 1;
		
		System.out.println("The 1-3-sum is " + (sum + oneThreeCalVal));
	}
}         
