import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];

		for(int i = 0; i < n; i++) arr1[i] = sc.nextInt();
		for(int i = 0; i < n; i++) arr2[i] = sc.nextInt();

		double value1 = 0.0;
		double value2 = 0.0;

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(arr1[i] > arr2[j]) value1 += 1.0;
				else if(arr1[i] < arr2[j]) value2 += 1.0;
			}
		}

		value1 /= (n * n);
		value2 /= (n * n);

		if(value1 > value2) System.out.println("first");
		else if(value1 == value2) System.out.println("tie");
		else System.out.println("second");
        sc.close();
    }
}
