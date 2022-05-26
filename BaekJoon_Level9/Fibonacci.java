package BaekJoon_Level9;
import java.io.*;
public class Fibonacci {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());

        int result=fibo(N);
        System.out.println(result);
    }
    private static int fibo(int N){
        if(N==0){
            return 0;
        }
        if(N==1)
            return 1;
        
        return fibo(N-1)+fibo(N-2);
    }
}
