import java.util.*;

public class BOJ_2622 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int cnt = 0;
        for(int a=1; a<n; a++){    // a가 가장 짧은변
            for(int b=a; b<n; b++){ // b>=a
                int c = n-(a+b);
                if(c < b) break;    //중복제외
                if(b+a > c) cnt++;  //삼각형 성립하는지
            }
        }

        System.out.println(cnt);
    }
}
