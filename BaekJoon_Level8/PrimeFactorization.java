package BaekJoon_Level8;
import java.io.*;
public class PrimeFactorization {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        if(N!=1){
            for(int i=2;i<=N;i++){
                while(N%i==0){
                    System.out.println(i);
                    N=N/i;
                }
            }
        }
        
    }
}
