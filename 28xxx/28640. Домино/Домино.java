import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String line1 = sc.next();
		int idx1 = line1.indexOf("|");
		int leftdot1 = idx1 < 0 ? 0 : idx1;
		int rightdot1 = idx1 < 0 ? 0 : line1.length() - idx1 - 1;
		
		String line2 = sc.next();
		int idx2 = line2.indexOf("|");
		int leftdot2 = idx2 < 0 ? 0 : idx2;
		int rightdot2 = idx2 < 0 ? 0 : line2.length() - idx2 - 1;

		int[] arr1 = {leftdot1, rightdot1};
		int[] arr2 = {leftdot2, rightdot2};

		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
		sc.close();
    }
}
