package Queue.PriorityQ;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class BOJ_4358 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        TreeMap<String, Float> tree = new TreeMap<>();
        int total = 0;
        while(true) {
            String input = br.readLine();
            if(input == null || input.equals("")) break;
            total++;
            if(tree.containsKey(input)){
                tree.put(input, tree.get(input)+1);
            }else{
                tree.put(input, 1f);
            }
        }
//        Object [] name = tree.keySet().toArray();
//        Arrays.sort(name);
//
        Iterator<String> it = tree.keySet().iterator();

//        for(String c : tree.keySet()){
        while(it.hasNext()){
            String c = it.next();
            bw.write(c + String.format(" %.4f\n",(tree.get(c)/total)*100));
        }
        bw.flush();
        bw.close();
    }
}
