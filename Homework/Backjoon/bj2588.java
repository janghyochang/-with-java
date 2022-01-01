import java.util.Scanner;

public class bj2588 {
    public static void main(String[] args){
        
        int a,b;
        int fisrtOut,secondOut,thirdOut;
        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();
        b = scanner.nextInt();

        fisrtOut = a * (b % 10);
        secondOut = a * (int)(b % 100 / 10);
        thirdOut = a * (int)(b / 100);

        System.out.println(fisrtOut);
        System.out.println(secondOut);
        System.out.println(thirdOut);
        System.out.println(thirdOut*100 + secondOut*10 + fisrtOut);
        

    }    
}
