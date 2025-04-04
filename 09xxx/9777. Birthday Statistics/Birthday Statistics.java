import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> month = new TreeMap<>();
        for(int i = 1; i <= 12; i++) month.put(i, 0);

        while (n-- > 0) {
            int id = sc.nextInt();
            String[] birth = sc.next().split("/");

            month.put(Integer.parseInt(birth[1]), month.get(Integer.parseInt(birth[1]))+1);
        }

        for(Map.Entry<Integer, Integer> entry : month.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        sc.close();
    }
}