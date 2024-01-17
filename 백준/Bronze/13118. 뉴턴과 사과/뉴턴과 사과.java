import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String[] people = sc.nextLine().split(" ");
		
		int[] peopleInt = new int[people.length];
		for(int i = 0; i < peopleInt.length; i++) peopleInt[i] = Integer.parseInt(people[i]);
		
		int x = sc.nextInt();
		
		int val = 0;
		
		for(int i = 0; i < peopleInt.length; i++) {
			if(peopleInt[i] == x) {
				val = i+1;
				break;
			}
		}
		
		
		System.out.println(val);
		sc.close();
	}
}         
