import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int n = sc.nextInt();
            if(n == 0) break;

            int joe = 0;
            int jean = 0;
            int jane = 0;
            int james = 0;
            int x = 0;

            for(int i = 0; i < n; i++) {
                String value = sc.next();

                if("SML".contains(value)) {
                    if(value.charAt(0) == 'S') james++;
                    else joe++;
                }
                else if("X".equals(value)) x++;
                else {
                    int num = Integer.parseInt(value);

                    if(num < 12) jane++;
                    else jean++;
                }
            }

            System.out.printf("%d %d %d %d %d\n", joe, jean, jane, james, x);
        }
        sc.close();
    }
}