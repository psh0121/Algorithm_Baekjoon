import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	
    	double sum = 0;
        double onlyBedroom = 0;
        double totalCost = 0;
    	
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cost = sc.nextInt();
        
        for(int i = 0; i < n; i++) {
        	double space = sc.nextDouble();
        	String name = sc.next();
        	
        	sum += space;
        	
        	if(name.equals("bedroom")) onlyBedroom += space;
        	
        	if(name.equals("balcony")) totalCost += space / 2;
        	else totalCost += space;
        }
        
        System.out.println((int)sum);
        System.out.println((int)onlyBedroom);
        System.out.println(totalCost * cost);
    }
}