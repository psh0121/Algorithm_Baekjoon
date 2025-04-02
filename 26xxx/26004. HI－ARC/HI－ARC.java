import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();

		int h = 0;
		int i = 0;
		int a = 0;
		int r = 0;
		int c = 0;
		
		for(int ii = 0; ii < n; ii++) {
			char alpha = s.charAt(ii);

			switch (alpha) {
				case 'H':
					h++;
					break;
				case 'I':
					i++;
					break;
				case 'A':
					a++;
					break;
				case 'R':
					r++;
					break;
				case 'C':
					c++;
					break;
				default:
					break;
			}
		}

		int minCnt = Math.min(h, i);
		minCnt = Math.min(minCnt, a);
		minCnt = Math.min(minCnt, r);
		minCnt = Math.min(minCnt, c);

		System.out.println(minCnt);
		
		sc.close();
    }
}