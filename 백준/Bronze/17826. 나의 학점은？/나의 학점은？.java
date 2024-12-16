import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] gradeStr = sc.nextLine().split(" ");
		String grade = sc.nextLine();
		int rank = 0;

		for(int i = 0; i < gradeStr.length; i++) {
			if(gradeStr[i].equals(grade)) {
				rank = i+1;
				break;
			}
		}

		String result = "";
		if(rank >= 1 && rank <= 5) result = "A+";
		else if(rank >= 6 && rank <= 15) result = "A0";
		else if(rank >= 16 && rank <= 30) result = "B+";
		else if(rank >= 31 && rank <= 35) result = "B0";
		else if(rank >= 36 && rank <= 45) result = "C+";
		else if(rank >= 46 && rank <= 48) result = "C0";
		else result = "F";

		System.out.println(result);
		sc.close();
    }
}
