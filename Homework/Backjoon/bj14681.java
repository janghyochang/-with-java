import java.util.Scanner;

public class bj14681 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a,b;

        a = scanner.nextInt();
        b = scanner.nextInt();

        if (a > 0 && b > 0){
            System.out.println("1");
        } else if ( a > 0 && b <0){
            System.out.println("4");
        } else if (a < 0 && b > 0){
            System.out.println("2");
        } else if (a < 0 && b < 0){
            System.out.println("3");
        }
    }    
}