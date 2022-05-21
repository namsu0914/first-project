package BaekJoon_Level8;
import java.io.*;
import java.util.StringTokenizer;
public class PrimeNumber {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st;
        int count=0;
        st=new StringTokenizer(br.readLine()," ");
        for(int i=0;i<N;i++){
            int a=Integer.parseInt(st.nextToken());
            int c=0;
            for(int j=1;j<a;j++){
                if(a%j==0){
                    c++;
                }
            }
            if(c==1){
                count++;
            }
        }
        System.out.println(count);
        br.close();
    }
}
