import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int[] numArr = {1, 2, 3, 4, 5, 6, 7, 8};
		String[] alphaArr = {"a", "b", "c", "d", "e", "f", "g", "h"};
		
		double getNum = sc.nextDouble();
		
		int alphaIdx = ((int)getNum - 1) % 8;
		int numIdx = (int) (Math.ceil(getNum / 8) - 1);
		
		System.out.println(alphaArr[alphaIdx] + numArr[numIdx]);
	}
}