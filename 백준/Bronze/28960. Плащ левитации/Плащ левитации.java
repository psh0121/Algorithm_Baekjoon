import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		double h = sc.nextDouble();
		double l = sc.nextDouble();
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		// 빨랫줄의 높이와 길이를 a, b 모두 넘어가지 않으면 yes
		if((a <= h && b <= l) || (b <= h && a <= l)) System.out.println("YES");
		
		// 빨랫줄에서 h에서 반접었을때 충족하면 yes
		else if((a / 2 <= h && b <= l) || (b / 2 <= h && a <= l)) System.out.println("YES");
		
		// 그외엔 no
		else System.out.println("NO");
	}
}         