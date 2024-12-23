import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] name = new String[n];
    int[] grade = new int[n];
    int maxGrade = 0;

    for(int i = 0; i < n; i++) {
      name[i] = sc.next();
      grade[i] = sc.nextInt();

      maxGrade = Math.max(maxGrade, grade[i]);
    }

    ArrayList<String> list = new ArrayList<>();
    for(int i = 0; i < n; i++) {
      if(grade[i] == maxGrade) list.add(name[i]);
    }
    
    Collections.sort(list);

    System.out.println(list.get(0));
		sc.close();
    }
}
