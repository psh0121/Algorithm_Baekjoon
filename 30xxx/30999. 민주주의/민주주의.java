import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	// 문제 후보의 수 
		int m = sc.nextInt();	// 출제위원의 수
		
		String problem;	// 문제후보 
		int problemPassCnt = 0;	// 문제 찬성 개수 
		
		int result = 0;	// 최종 문제 개수 
		
		for(int i = 0; i < n; i++) {
			problem = sc.next();
			problemPassCnt = 0;
			
			for(int j = 0; j < problem.length(); j++) {
				if(problem.charAt(j) == 'O') problemPassCnt++;
			}
			
			if(problemPassCnt > m / 2) result++;
		}
		
		System.out.println(result);
	}
}         
