import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            String str = sc.nextLine();

            // 종료
            if(str.equals("I quacked the code!")) break;

            char lastStr = str.charAt(str.length() - 1);

            if(lastStr == '.') System.out.println("*Nod*");
            else if(lastStr == '?') System.out.println("Quack!");

            System.out.flush();
        }
        
        sc.close();
    }
}