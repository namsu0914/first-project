package BaekJoon_Level4;
import java.io.*;
import java.io.IOException;
import java.util.StringTokenizer;

public class Biggest {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int[]ar=new int[9];
        int i;
        
        for(i=0;i<9;i++){
            st=new StringTokenizer(br.readLine()," ");
            ar[i]=Integer.parseInt(st.nextToken());
        }
        int max=ar[0];
        int index=0;
        for(i=0;i<9;i++){
            if(max<ar[i]){
                max=ar[i];
                index=i;
            }
                
        }
        bw.write(max+"\n"+(index+1));
        br.close();
        bw.flush();
        bw.close();
    }
}
