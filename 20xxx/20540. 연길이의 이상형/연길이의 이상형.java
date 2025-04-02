import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		String mbti = sc.next();
		String loveMbti = "";

		if(mbti.charAt(0) == 'E') loveMbti += 'I';
		else loveMbti += 'E';

		if(mbti.charAt(1) == 'S') loveMbti += 'N';
		else loveMbti += 'S';

		if(mbti.charAt(2) == 'T') loveMbti += 'F';
		else loveMbti += 'T';

		if(mbti.charAt(3) == 'J') loveMbti += 'P';
		else loveMbti += 'J';

		System.out.println(loveMbti);
    	sc.close();
    }
}