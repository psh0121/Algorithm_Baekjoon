import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String[] strArr = sc.nextLine().split(" ");
		int[] numArr = {
				Integer.parseInt(strArr[0]),
				Integer.parseInt(strArr[2]),
				Integer.parseInt(strArr[4]),
				};
		
		if(numArr[0] + numArr[1] == numArr[2]) System.out.println("YES");
		else System.out.println("NO");
		sc.close();
	}
}         
