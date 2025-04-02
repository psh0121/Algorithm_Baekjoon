import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int v1MV = 0;
		int v2MV = 0;
		int v1Vote = 0;
		int v2Vote = 0;

		for(int i = 0; i < n; i++) {
			int mv = sc.nextInt();
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();

			if(v1 > v2) v1MV += mv;
			else if(v1 < v2) v2MV += mv;

			v1Vote += v1;
			v2Vote += v2;
		}

		if(v1MV > v2MV && v1Vote > v2Vote) System.out.println(1);
		else if(v1MV < v2MV && v1Vote < v2Vote) System.out.println(2);
		else System.out.println(0);

		sc.close();
    }
}
