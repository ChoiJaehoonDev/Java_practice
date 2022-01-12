package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_2841 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int move = 0;
        int n = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        HashMap<Integer, Stack<Integer>> f = new HashMap<>();

        int line = 0;
        int pret = 0;

        while(n > 0){
            st = new StringTokenizer(br.readLine());
            line = Integer.parseInt(st.nextToken());
            pret = Integer.parseInt(st.nextToken());

            //해당하는 라인마다 스택 생성
            // 만약 처음 잡는 줄이면 새로 생성
            if(!f.containsKey(line)){
                f.put(line, new Stack<>());
            }
            // 그 줄이 비어잇으면 바로 추가하고 끝
            if(f.get(line).isEmpty()){
                f.get(line).push(pret);
                move++;
            }else{
                //아니라면 체크 필요
                // 프렛이 큰 경우, 작은 경우, 같은 경우
                // 크다면 작거나 같아질때까지 loop
                while(f.get(line).peek() > pret){
                    f.get(line).pop();
                    move++;
                    if(f.get(line).isEmpty()) break;
                }
                if(f.get(line).isEmpty()){
                    f.get(line).push(pret);
                    move++;
                }
                else if(f.get(line).peek() < pret){
                    f.get(line).push(pret);
                    move++;
                }else{

                }
            }
            n--;
        }
        System.out.println(move);
    }
}

