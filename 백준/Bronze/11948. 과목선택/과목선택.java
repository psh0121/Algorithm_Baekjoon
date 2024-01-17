import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int[] sub4 = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
		int[] sub2 = {sc.nextInt(), sc.nextInt()};
		
		int minSub4 = 100;
		int minSub2 = 100;
		
		boolean isChange = false;
		int sum = 0;
		
		for(int i = 0; i < sub4.length; i++) minSub4 = Math.min(minSub4, sub4[i]);
		for(int i = 0; i < sub2.length; i++) minSub2 = Math.min(minSub2, sub2[i]);
		
		for(int i = 0; i < sub4.length; i++) sum += sub4[i];
		for(int i = 0; i < sub2.length; i++) sum += sub2[i];
		
		sum  = sum - minSub4 - minSub2;
		
		System.out.println(sum);
		sc.close();
	}
}         
