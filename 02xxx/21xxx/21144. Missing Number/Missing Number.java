import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = sc.next();

        for(int i = 1; i <= num; i++) {
            if(str.length() == 0) {
                System.out.println(i);
                break;
            }

            if(str.indexOf(Integer.toString(i)) != 0) {
                System.out.println(i);
                break;
            }

            str = str.substring(Integer.toString(i).length());
        }
        sc.close();
    }
}