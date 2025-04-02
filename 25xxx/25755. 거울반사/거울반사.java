import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String w = sc.next();
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        String[][] changeArr = new String[n][n];

        if(w.equals("L") || w.equals("R")) {
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    changeArr[j][i] = Integer.toString(arr[j][n-1-i]); 
                }
            }
        }
        else {
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    changeArr[i][j] = Integer.toString(arr[n-1-i][j]);
                }
            }
        }


        for(int i = 0; i < n; i++) {
            String result = "";
            for(int j = 0; j < n; j++) {
                String value = changeArr[i][j];

                if(value.equals("1") || value.equals("8")) {
                    result += value + " ";
                }
                else if(value.equals("2")) {
                    result += "5 ";
                }
                else if(value.equals("5")) {
                    result += "2 ";
                }
                else result += "? ";
            }
            System.out.println(result.trim());
        }
        sc.close();
    }
}
