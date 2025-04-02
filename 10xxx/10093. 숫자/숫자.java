import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();

		if(a == b) System.out.println(0);
		
		else {
			if(a > b) {
				long temp = a;
				a = b;
				b = temp;
			}
			long cnt = b - a - 1;
	
			System.out.println(cnt);
	
			for(long i = a + 1; i < b; i++) {
				System.out.print(i + " ");
			}
		}

		sc.close();
    }
}
