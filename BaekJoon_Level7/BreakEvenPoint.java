package BaekJoon_Level7;
import java.util.StringTokenizer;
import java.io.*;
public class BreakEvenPoint {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int mar;

        st=new StringTokenizer(br.readLine()," ");
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        int c=Integer.parseInt(st.nextToken());
        if((b-c)>=0){
            mar=-1;
        }
        else{
            mar=a/(c-b)+1;
        }
        System.out.println(mar);
    }
}
