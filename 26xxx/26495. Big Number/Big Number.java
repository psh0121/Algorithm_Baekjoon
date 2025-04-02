import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		String[] arr = sc.nextLine().split("");
		
		for(int i = 0; i < arr.length; i++) {
			switch(arr[i]) {
			case "0":
				System.out.println("0000\n0  0\n0  0\n0  0\n0000");
				break;
			case "1":
				System.out.println("   1\n   1\n   1\n   1\n   1");
				break;
			case "2":
				System.out.println("2222\n   2\n2222\n2\n2222");
				break;
			case "3":
				System.out.println("3333\n   3\n3333\n   3\n3333");
				break;
			case "4":
				System.out.println("4  4\n4  4\n4444\n   4\n   4");
				break;
			case "5":
				System.out.println("5555\n5\n5555\n   5\n5555");
				break;
			case "6":
				System.out.println("6666\n6\n6666\n6  6\n6666");
				break;
			case "7":
				System.out.println("7777\n   7\n   7\n   7\n   7");
				break;
			case "8":
				System.out.println("8888\n8  8\n8888\n8  8\n8888");
				break;
			default:
				System.out.println("9999\n9  9\n9999\n   9\n   9");
				break;
			}
			System.out.println();
		}
	}
}