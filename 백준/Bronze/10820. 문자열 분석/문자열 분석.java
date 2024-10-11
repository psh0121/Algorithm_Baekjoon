import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String str = sc.nextLine();
			int lower = 0;
			int upper = 0;
			int num = 0;
			int space = 0;

			for(int i = 0; i < str.length(); i++) {
				String letter = Character.toString(str.charAt(i));

				if(letter.equals(" ")) space++;
				else if("0123456789".contains(letter)) num++;
				else if(letter.toUpperCase().equals(letter)) upper++;
				else lower++;
			}

			System.out.printf("%d %d %d %d\n", lower, upper, num, space);
		}
		sc.close();
    }
}
