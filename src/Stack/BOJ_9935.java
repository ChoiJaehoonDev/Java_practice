package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Stack;

public class BOJ_9935 {
    public static void main(String[] args) throws IOException {
        // StringBuilder로 통째로 비교하기보다 문자 하나하나 비교하는게 메모리 덜먹음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        String bomb = br.readLine();
        int size = bomb.length();
//        StringBuilder sb = new StringBuilder();

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < line.length(); i++){
            stack.push(line.charAt(i));

            if(stack.size() >= size){
                int interval = stack.size() - size;
                boolean check = true;
                for(int idx = 0; idx<size; idx++){
                    if(bomb.charAt(idx) != stack.elementAt(interval+idx)){
                        check = false;
                        break;
                    }
                }
                if(check){
                    for(int t = 0; t < size; t++) stack.pop();
                }
            }
        }

        if(stack.size() == 0) System.out.println("FRULA");
        else{
            StringBuilder sb = new StringBuilder();
            while (!stack.isEmpty()){
                sb.append(stack.pop());
            }
            System.out.println(sb.reverse());
        }

        // StringBuilder 사용 -> 메모리 초과
//        for(char c: line){
//            sb.append(c);
//            if(sb.length() >= bomb.length()){
//                if(bomb.equals(sb.substring(sb.length()-size,sb.length()))){
//
//                    String temp = sb.substring(0, sb.length()-size);
//                    sb.setLength(0);
//                    sb.append(temp);
//
//                }
//            }
//        }
//
//
//
//        if (sb.length()==0) System.out.println("FRULA");
//        else System.out.println(sb);
    }
}
