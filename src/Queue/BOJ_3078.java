package Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

public class BOJ_3078 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int gf = 0;

        HashMap<Integer, ArrayDeque<Integer>> hm = new HashMap<>();

        for(int i = 0; i < n; i++){
            String nf = br.readLine();
            int length = nf.length();

            if(!hm.containsKey(length)) hm.put(length, new ArrayDeque<>());
            hm.get(length).add(i);
        }
        for(int l : hm.keySet()){

        }


    }
}
