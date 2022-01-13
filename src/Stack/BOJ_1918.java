package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class BOJ_1918 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char []  line = br.readLine().toCharArray();
        StringBuilder sb = new StringBuilder();

        // 문자는 그대로 sb에 넘김
        // 연산자가 들어오고 +, -인 경우 앞이 *,/일 때 전부 pop()
        // 괄호 -> List<Stack<Integer>> -> 0~n(괄호의 깊이에 따라) 하나씩 추가, range 설정,
        // (일 경우 range++, new Stack(),
        // )인 경우 남은 연산자를 다 빼고 삭제
        // 마지막에 list[0]에 든것까지 뺴면 됨

        ArrayList<Stack<Character>> operation = new ArrayList<>();
        operation.add(new Stack<>());   //괄호가 없는 가장 바깥의 경우 idx:0
        int idx = 0; // 현재 괄호의 깊이

        for(char c : line){
            if(c >= 65 && c < 90){
                sb.append(c);
            }
            else if(c == '('){
                operation.add(new Stack<>());
                idx++;
            }else if(c == ')'){
                while(!operation.get(idx).isEmpty()) sb.append(operation.get(idx).pop());
                operation.remove(idx--);
            }
            else {
                if(!operation.get(idx).isEmpty()){
                    if(operation.get(idx).peek() == '*' || operation.get(idx).peek() == '/'){
                        sb.append(operation.get(idx).pop());
                    }
                    if((c == '+' || c == '-') && !operation.get(idx).isEmpty()){
                        sb.append(operation.get(idx).pop());
                    }
                }
                operation.get(idx).push(c);
            }
        }
        while(!operation.get(idx).isEmpty()) sb.append(operation.get(idx).pop());
        System.out.println(sb);
    }
}
