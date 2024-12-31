import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<String> list = new ArrayList<>();
    for(int i = 0; i < n; i++) list.add(sc.next());

    ArrayList<String> cookList = new ArrayList<>();
    for(int i = 0;i < n-1; i++) cookList.add(sc.next());

    for(String value : list) {
      if(!cookList.contains(value)) {
        System.out.println(value);
      }
    }
		sc.close();
    }
}
