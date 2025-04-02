import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] arr = sc.next().split("");
		int[] numArr = new int[3];
		for(int i = 0; i < 3; i++) numArr[i] = Integer.parseInt(arr[i]);
		Arrays.sort(numArr);

		String num = Integer.toString(numArr[0]) + numArr[1] + numArr[2];

		if(num.equals("123") ||
			num.equals("456") ||
			num.equals("789") ||
			num.equals("147") ||
			num.equals("258") ||
			num.equals("369") ||
			num.equals("058")
		) {
			System.out.println("Unlocked");
		}
		
		else System.out.println("Locked");
		sc.close();
    }
}
