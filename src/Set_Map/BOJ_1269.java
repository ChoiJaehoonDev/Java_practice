package Set_Map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ_1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int na = Integer.parseInt(st.nextToken());
        int nb = Integer.parseInt(st.nextToken());
        int answer = 0;
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            a.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            if(a.contains(num)){
                a.remove(num);
            }else{
                a.add(num);
            }
        }

        System.out.println(a.size());
    }
}
