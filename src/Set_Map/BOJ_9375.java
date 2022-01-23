package Set_Map;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t  = Integer.parseInt(br.readLine());
        StringTokenizer st;

        while(t>0){
            HashMap<String, Integer> hm = new HashMap();
            int answer = 0;
            int n = Integer.parseInt(br.readLine());
            while(n>0){
                st = new StringTokenizer(br.readLine());

                String c = st.nextToken();
                c = st.nextToken();
                if(hm.containsKey(c)){
                    hm.put(c, hm.get(c)+1);
                }else{
                    hm.put(c, 1);
                }
                n--;
            }

            int temp = 1;
            for(String s : hm.keySet()){
                temp *= (hm.get(s) + 1);
            }
            System.out.println(temp-1);
            t--;
        }
    }
}
