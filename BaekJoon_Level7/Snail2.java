package BaekJoon_Level7;
import java.io.*;
import java.util.StringTokenizer;
public class Snail2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st;

        st=new StringTokenizer(br.readLine()," ");
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        int v=Integer.parseInt(st.nextToken());

        int result=0;
        result=(v-b)/(a-b);

        if((v-b)%(a-b)!=0){
            result++;
        }
        System.out.print(result);
    }
}
