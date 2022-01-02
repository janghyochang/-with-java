import java.util.Scanner;

public class bj2753 {
    public static void main(String[] args){
        
        int year;
        int flag =0;
        
        Scanner scanner = new Scanner(System.in);

        year = scanner.nextInt();

        if (year % 4 == 0 && year % 100 != 0){
            flag =1;
        }

        if (year % 400 ==0) {
            flag = 1;
        }

        System.out.println(flag);

    }
}
