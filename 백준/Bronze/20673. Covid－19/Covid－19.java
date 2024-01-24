import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int q = sc.nextInt();
		
		if(p <= 50 && q <= 10) System.out.println("White");
		else if(q > 30) System.out.println("Red");
		else System.out.println("Yellow");
		
		// 하양 
		// 지난 2주 동안 하루 신규확진수의 평균이 최대 100만명당 50명 
		// 지난 2주동안 하루 신규 입원 수의 평균이 최대 100만명 당 10명 
	
		// 빨강 
		// 지난 2주 동안 하루 신규 입원 수의 평균이 100만명 당 30명보다 많다
		
		// 노랑 
		// 나머지 
	}
}         