import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] call = {"", "", "ABC", "DEF",
						"GHI", "JKL", "MNO", "PQRS",
						"TUV", "WXYZ"				
		};
		String str = sc.next();
		int time = 0;

		for(int i = 0; i < str.length(); i++) {
			for(int j = 0; j < call.length; j++) {
				if(call[j].contains(Character.toString(str.charAt(i)))) {
					time += j+1;
				}
			}
		}

		System.out.println(time);
		sc.close();
    }
}
