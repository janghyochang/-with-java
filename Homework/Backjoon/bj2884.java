import java.util.Scanner;

public class bj2884 {
    public static void main(String[] args){
        
        int hour,minute;

        Scanner scanner = new Scanner(System.in);

        hour = scanner.nextInt();
        minute = scanner.nextInt();

        if (hour !=0 && minute >= 45){
            System.out.println(hour + " " + (minute-45));
        } else if (hour !=0 && minute < 45){
            System.out.println((hour-1) + " " + (minute + 15));
        } else if (hour == 0 && minute < 45){
            System.out.println(23 + " " + (minute + 15));
        } else if (hour == 0 && minute >= 45){
            System.out.println(0 + " " + (minute-45));
        }
    }
}
