import java.util.Scanner;

public class bj1330 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int a,b;
        a = scanner.nextInt();
        b = scanner.nextInt();

        if (a > b){
            System.out.println(">");
        }
        if (a < b){
            System.out.println("<");
        }
        if (a == b){
            System.out.println("==");
        }



    }
    
}
