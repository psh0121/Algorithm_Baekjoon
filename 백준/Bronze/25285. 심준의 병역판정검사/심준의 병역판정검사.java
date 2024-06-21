import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			double cm = sc.nextDouble();
			double kg = sc.nextDouble();

			double bmi = kg / (cm * cm / (double)10000);

			int result = 0;

			if(cm < 140.1) result = 6;
			else if(cm < 146) result = 5;
			else if(cm < 159) result = 4;
			else if(cm < 161) {
				if(bmi < 16.0) result = 4;
				else if(bmi < 35.0) result = 3;
				else result = 4;
			}
			else if(cm < 204) {
				if(bmi < 16.0) result = 4;
				else if(bmi < 18.5) result = 3;
				else if(bmi < 20.0) result = 2;
				else if(bmi < 25.0) result = 1;
				else if(bmi < 30.0) result = 2;
				else if(bmi < 35.0) result = 3;
				else result = 4;
			}
			else result = 4;

			System.out.println(result);
		}

		sc.close();
    }
}