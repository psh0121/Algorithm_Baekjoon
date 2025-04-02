import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0) {
            String str = sc.next();
            
            Map<Character, Integer> map = new HashMap<>();
            for(int i = 0; i < str.length(); i++) {
                char letter = str.charAt(i);

                map.put(letter, map.getOrDefault(letter, 0)+1);
            }

            int minX = 0;
            int maxX = 0;
            int minY = 0;
            int maxY = 0;

            for(Character key : map.keySet()) {
                int value = map.get(key);

                if(key == 'U') {
                    minY+=value;
                    maxY+=value;
                }
                else if(key == 'R') {
                    minX+=value;
                    maxX+=value;
                }
                else if(key == 'D') {
                    minY-=value;
                    maxY-=value;
                }
                else if(key == 'L') {
                    minX-=value;
                    maxX-=value;
                }
                else {
                    minX-=value;
                    minY-=value;
                    maxX+=value;
                    maxY+=value;
                }
            }

            System.out.printf("%d %d %d %d\n", minX, minY, maxX, maxY);
            
        }
        sc.close();
    }
}