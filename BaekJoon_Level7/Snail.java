package BaekJoon_Level7;
import java.io.*;
import java.util.StringTokenizer;
public class Snail {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st;

        st=new StringTokenizer(br.readLine()," ");
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        int v=Integer.parseInt(st.nextToken());

        int sum=0,i=0;
        while(sum<v){
            i++;
            sum+=a;
            if(sum>=v)
                break;
            sum-=b;
        }
        System.out.println(i);
        br.close();
    }
}
