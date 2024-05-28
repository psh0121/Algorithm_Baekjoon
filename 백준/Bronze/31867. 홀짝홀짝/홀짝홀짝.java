import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();	// 자릿수 
		String k = sc.next();	// 자연수 

		int odd = 0;	// 홀수 개수
		int even = 0;	// 짝수 개수 

		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(Character.toString(k.charAt(i)));
			
			if(num % 2 == 0) even++;
			else odd++;
		}

		if(odd > even) System.out.println(1);
		else if(odd == even) System.out.println(-1);
		else System.out.println(0);
		
    	sc.close();
    }
}