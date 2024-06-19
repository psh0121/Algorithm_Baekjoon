import java.util.Scanner;

public class Main {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();

		int s = 0;
		int b = 0;

		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 's') s++;
			else if(str.charAt(i) == 'b') b++;
		}

		if(b > s) System.out.println("bigdata?");
		else if(b == s) System.out.println("bigdata? security!");
		else System.out.println("security!");
		sc.close();
    }
}