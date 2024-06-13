import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		
		int alphaCnt = 0;
		int numberCnt = 0;

		for(int i = 0; i < n; i++) {
			if(str.charAt(i) == 'e') alphaCnt++;
			else numberCnt++;
		}

		if(alphaCnt > numberCnt) System.out.println("e");
		else if (alphaCnt == numberCnt) System.out.println("yee");
		else System.out.println("2");

		sc.close();
    }
}