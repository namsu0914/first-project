package BaekJoon_Level8;
import java.io.*;
public class PrimeNumber2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int M=Integer.parseInt(br.readLine());
        int N=Integer.parseInt(br.readLine());
        int sum=0,min=0;
        for(int i=M;i<=N;i++){
            int c=0;
            for(int j=1;j<i;j++){
                if(i%j==0){
                    c++;
                }
            }
            if(c==1){
                if(sum==0){
                    min=i;
                }
                sum+=i;
            }
        }
        if(sum==0){
            System.out.print(-1);
        }else{
            System.out.println(sum);
            System.out.println(min);
        }
        
    }
}
