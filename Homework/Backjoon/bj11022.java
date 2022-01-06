import java.io.*;
import java.util.StringTokenizer;  

public class bj11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int cycle = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < cycle; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            
            bw.write("Case #"+(i+1)+ ": "+ A + " + " + B + " = " + (A+B) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
}
}
