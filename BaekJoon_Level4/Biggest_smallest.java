package BaekJoon_Level4;
import java.io.*;
import java.util.StringTokenizer;
public class Biggest_smallest {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N=Integer.parseInt(br.readLine());

        int[]ar=new int[N];
        int i=0;
        st=new StringTokenizer(br.readLine()," ");
        for(i=0;i<N;i++){
            
            ar[i]=Integer.parseInt(st.nextToken());
        }
        int max=ar[0],min=ar[0];
        for(i=0;i<N;i++){
            if(max<ar[i])
                max=ar[i];
        }
        for(i=0;i<N;i++){
            if(min>ar[i])
                min=ar[i];
        }
        bw.write(min+" "+max);
        br.close();
        bw.flush();
        bw.close();

    }
}

