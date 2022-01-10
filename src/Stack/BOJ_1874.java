package Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class BOJ_1874 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Stack<Integer> stack =new Stack<>();
        int [] comp = new int[n];
        for(int i = 0; i< n; i++){
            comp[i] = scanner.nextInt();
        }

        int i = 0;
        int num = 0;
        StringBuilder sb = new StringBuilder();
        while(true){
            if(i == n) break;
            if(num > n){
                sb = new StringBuilder();
                sb.append("NO");
                break;
            }
            if(!stack.isEmpty()){
                if(stack.peek() == comp[i]){
                    stack.pop();
                    sb.append("-\n");
                    i++;
                }else{
                    stack.push(++num);
                    sb.append("+\n");
                }
            }else{
                stack.push(++num);
                sb.append("+\n");
            }
        }
        System.out.println(sb);
    }
}
