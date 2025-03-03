import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('A', 2);
        map.put('B', 2);
        map.put('C', 2);
        
        map.put('D', 3);
        map.put('E', 3);
        map.put('F', 3);

        map.put('G', 4);
        map.put('H', 4);
        map.put('I', 4);

        map.put('J', 5);
        map.put('K', 5);
        map.put('L', 5);

        map.put('M', 6);
        map.put('N', 6);
        map.put('O', 6);

        map.put('P', 7);
        map.put('Q', 7);
        map.put('R', 7);
        map.put('S', 7);

        map.put('T', 8);
        map.put('U', 8);
        map.put('V', 8);

        map.put('W', 9);
        map.put('X', 9);
        map.put('Y', 9);
        map.put('Z', 9);

        for(int i = 0; i < n; i++) {
            String name = sc.next().toUpperCase();
            StringBuilder sb = new StringBuilder();

            for(int j = 0; j < name.length(); j++) {
                char key = name.charAt(j);
                sb.append(map.get(key));
            }

            if(sb.toString().equals(sb.reverse().toString())) {
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
        sc.close();
    }
}
