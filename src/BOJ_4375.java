import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_4375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        while(true){

            StringTokenizer str = new StringTokenizer(br.readLine());
            if(!str.hasMoreTokens()){
                break;
            }
            int n = Integer.parseInt(str.nextToken());
            int i = 1;
            StringBuilder sb = new StringBuilder();
            while(true){
                sb.append('1');
                if(Long.parseLong(sb.toString()) % n == 0){
                    System.out.println(i);
                    break;
                }
                i++;
            }
        }
        br.close();
    }
}
