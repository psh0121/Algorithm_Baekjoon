import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());

		for(int i = 1; i <= n; i++){
			String[] strArr = sc.nextLine().split(" ");
			int[] arr = new int[strArr.length];
			for(int j = 0; j < arr.length; j++) arr[j] = Integer.parseInt(strArr[j]);

			int[] newArr = new int[arr.length - 1];

			for(int j = 0; j < newArr.length; j++) {
				if(j == 0) {
					newArr[j] = arr[j] - 1;
					continue;
				}
				newArr[j] = arr[j] * (newArr.length - j);
			}

			System.out.print("Case " + i + ":");
			for(int j = 0; j < newArr.length; j++) System.out.print(" " + newArr[j]);
			System.out.println();
		}
		sc.close();
    }
}
