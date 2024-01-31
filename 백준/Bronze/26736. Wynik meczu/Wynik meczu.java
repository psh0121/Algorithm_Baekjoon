import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		String[] gradeBoard = sc.next().split("");
		int a = 0;
		int b = 0;
		
		for(int i = 0; i < gradeBoard.length; i++) {
			if(gradeBoard[i].equals("A")) a++;
			else b++;
		}
		
		System.out.println(a + " : " + b);
	}
}