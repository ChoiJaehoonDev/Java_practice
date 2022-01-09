import javax.swing.text.html.HTMLDocument;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while(t > 0){
            String st = br.readLine();
            char [] line = st.toCharArray();
            Deque<Character> s1 = new ArrayDeque<>();    // 최종으로 출력할 메모리, -가 입력되면 맨 위에 있는 문자 삭제
            Deque<Character> s2 = new ArrayDeque<>();    // <가 입력되면 s1에 있던 문자 옮기기, >가 입력되면 맨 위에 문자 s1으로 옮기기


            for(char c: line){
                switch (c){
                    case '<':
                        if(!s1.isEmpty()) s2.offerLast(s1.pollLast());
                        break;
                    case '>':
                        if(!s2.isEmpty()) s1.offerLast(s2.pollLast());
                        break;
                    case '-':
                        if (!s1.isEmpty()) s1.pollLast();
                        break;
                    default:
                        if(c != '<' && c != '>' && c!='-') s1.offerLast(c);
                        break;
                }
            }
            while(!s2.isEmpty()){
                s1.offerLast(s2.pollLast());
            }

            StringBuilder sb = new StringBuilder();
            while(!s1.isEmpty()){
                sb.append(s1.pollFirst());
            }

            System.out.println(sb);
            t--;
        }
    }
}
