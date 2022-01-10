package List;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.stream.StreamSupport;

public class BOJ_1158 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        ArrayList<Integer> yose = new ArrayList<>();

        for(int i = 0; i< n; i++){
            yose.add(i+1);
        }
        System.out.print('<');
        int start = k;
        while(yose.size() > 0){

            System.out.printf("%d", yose.get(start-1));
            yose.remove(start-1);
            if(yose.size() == 0) break;
            start += k-1;

            while(start >= yose.size()) {
                start -= yose.size();
            }

            while(start <= 0) {
                start += yose.size();
            }

            if(yose.size() > 0){
                System.out.print(", ");
            }
        }
        System.out.println('>');
    }
}
