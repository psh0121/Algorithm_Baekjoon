import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int w, k;
		int result = 0;
		
		for(int i = 0; i < cnt; i++) {
			w = sc.nextInt();
			k = sc.nextInt();
			
			result = (w / 2) * k;
			
			if(w % 2 == 1) {
				result += k / 2; 
			}
			
			System.out.println(result);
		}
	}
}         
