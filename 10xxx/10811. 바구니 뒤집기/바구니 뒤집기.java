import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n+1];
		for(int i = 0; i < arr.length; i++) arr[i] = i;

		for(int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			int j = 1;
			int[] newArr = new int[n+1];
			for(int idx = 0; idx < arr.length; idx++) {
				newArr[idx] = arr[idx];
			}

			while (j < arr.length) {
				if(j < a || j > b) newArr[j] = arr[j];
				else {
					for(int k = b; k >= a; k--) {
						newArr[j++] = arr[k];
					}
				}
				j++;
			}

			arr = newArr;
		}

		for(int i = 1; i < arr.length; i++) {
			System.out.print(arr[i]);

			if(i != arr.length - 1) System.out.print(" ");
		}

		sc.close();
    }
}
