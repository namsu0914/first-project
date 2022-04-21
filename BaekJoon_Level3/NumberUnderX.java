package BaekJoon_Level3;
import java.io.*;
import java.util.StringTokenizer;
public class NumberUnderX {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N=Integer.parseInt(st.nextToken());
        int X=Integer.parseInt(st.nextToken());

        StringBuilder sb=new StringBuilder();
        st= new StringTokenizer(br.readLine()," ");

        for (int i=0;i<N;i++){
            int value=Integer.parseInt(st.nextToken());

            if(value<X)
            sb.append(value).append(' ');
        }
        System.out.println(sb);
        br.close();
        
    }
}