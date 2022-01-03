import  java.io.*;
import java.math.BigInteger;
public class BOJ_13706 {
    public  static  void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger num = new BigInteger(br.readLine());


        BigInteger left = new BigInteger("1");
        BigInteger right = new BigInteger(num.toString());
        BigInteger two = new BigInteger("2");
        BigInteger mid = null;

        while(true){
            mid = left.add(right).divide(two);
            if (mid.pow(2).compareTo(num) == 0){
                System.out.println(mid);
                break;
            }else if(mid.pow(2).compareTo(num) > 0){
                right = mid;
            }else{
                left = mid;
            }

        }
    }
}
