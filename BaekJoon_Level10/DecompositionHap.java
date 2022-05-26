package BaekJoon_Level10;
import java.io.*;
public class DecompositionHap {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        
        int result=0;
        for(int i=1;i<=N;i++){
            int sum=0;
            sum+=i;
            int j=i;
            while(j!=0){
                sum+=j%10;
                j=j/10;
                
            }
            if(sum==N){
                result=i;
                break;
            }
        }
        System.out.println(result);
    }
}
