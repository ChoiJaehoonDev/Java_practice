package List;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer oper;

        Deque<Character> pre = new ArrayDeque<>();  // 나중에 출력할 스택
        Deque<Character> re = new ArrayDeque<>();   // 임시로 커서 옮길 스택

        for(char c: line.toCharArray()){
            pre.offerLast(c);
        }

        while(n > 0){
            oper = new StringTokenizer(br.readLine());
            String o1 = oper.nextToken();
            if(o1.equals("L")){
                if(!pre.isEmpty()) re.offerLast(pre.pollLast());
            }else if(o1.equals("D")){
                if(!re.isEmpty()) pre.offerLast(re.pollLast());
            }else if(o1.equals("B")){
                if(!pre.isEmpty()) pre.pollLast();
            }
            else{
                if(!o1.equals("L") &&!o1.equals("D") &&!o1.equals("B")){
                    char o2 = oper.nextToken().charAt(0);
                    pre.offerLast(o2);
                }
            }

            n--;
        }
        StringBuilder sb = new StringBuilder();
        while (!re.isEmpty()){
            pre.offerLast(re.pollLast());
        }
        while(!pre.isEmpty()) sb.append(pre.pollFirst());
        System.out.println(sb);
    }

}
