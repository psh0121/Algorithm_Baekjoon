import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String[] num = sc.next().split("");
			
			if(num[0].equals("0")) break;
			
			int cm = num.length + 1;
			
			for(int i = 0; i < num.length; i++) {
				if(Integer.parseInt(num[i]) == 0) cm += 4;
				else if(Integer.parseInt(num[i]) == 1) cm += 2;
				else cm += 3;
			}
			
			System.out.println(cm);
		}
	}
}