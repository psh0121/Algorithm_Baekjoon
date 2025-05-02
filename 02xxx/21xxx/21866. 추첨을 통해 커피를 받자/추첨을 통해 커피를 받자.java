import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int[] gradeArr = {100, 100, 200, 200, 300, 300, 400, 400, 500};
		
		String[] strParticiArr = sc.nextLine().split(" ");
		int[] numParticiArr = new int[9];
		for(int i = 0; i < 9; i++) numParticiArr[i] = Integer.parseInt(strParticiArr[i]);

		int sumGrade = 0;
		boolean hackerFlag = false;

		for(int i = 0; i < 9; i++) {
			sumGrade += numParticiArr[i];

			if(numParticiArr[i] > gradeArr[i]) {
				hackerFlag = true;
				break;
			}
		}

		if(hackerFlag) System.out.println("hacker");
		else System.out.println(sumGrade >= 100 ? "draw" : "none");
		
		sc.close();
    }
}