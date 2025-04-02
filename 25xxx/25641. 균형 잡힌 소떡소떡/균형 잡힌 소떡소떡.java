import java.util.Scanner;

public class Main {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String line = sc.next();

		// 소세지와 떡 수량 파악 
		int s = 0;
		int d = 0;

		for(int i = 0; i < line.length(); i++) {
			if(line.charAt(i) == 's') s++;
			else d++;
		}

		while (s != d) {
			if(line.charAt(0) == 's') s--;
			else d--;

			line = line.substring(1);
		}

		System.out.println(line);
		sc.close();
    }
}