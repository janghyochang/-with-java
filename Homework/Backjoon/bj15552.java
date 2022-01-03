import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.*;

public class bj15552 {
    public static void main(String[] args){
        try{
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            String s = bf.readLine();
            StringTokenizer st = new StringTokenizer(s);

        } catch(IOException e){                 // 입출력 스트림 예외처리
			e.printStackTrace();
			System.out.println(e.getMessage());
        }
    }
}
