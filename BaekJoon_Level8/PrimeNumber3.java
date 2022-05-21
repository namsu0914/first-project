package BaekJoon_Level8;
import java.io.*;
import java.util.StringTokenizer;
public class PrimeNumber3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     
        StringTokenizer st;
        st=new StringTokenizer(br.readLine()," ");
        int M=Integer.parseInt(st.nextToken());
        int N=Integer.parseInt(st.nextToken());
        
        boolean arr[]=new boolean[N+1];
        arr[0]=true;
        arr[1]=true;

        for(int i=2;i<=Math.sqrt(N+1);i++){
            for(int j=i*i;j<N+1;j+=i){
                arr[j]=true;
            }
        }
        for(int i=M;i<N+1;i++){
            if(arr[i]==false){
                System.out.println(i);
            }
        }
    }
}
