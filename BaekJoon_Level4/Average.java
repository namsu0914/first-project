package BaekJoon_Level4;
import java.io.*;
//import java.io.IOException;
import java.util.StringTokenizer;

public class Average {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n=Integer.parseInt(br.readLine());
        st=new StringTokenizer(br.readLine()," ");
        double[]score=new double[n];
        double max=0.0,ave=0.0;

        for(int i=0;i<n;i++){
            score[i]=Integer.parseInt(st.nextToken());
            if(max<score[i]){
                max=score[i];
                //System.out.println(max);
            }
        }
        double a=0;
        for(int i=0;i<n;i++){
            a=(score[i]/max)*100;
            score[i]=a;
            ave+=score[i];
        }
        System.out.println(ave/n);
    }
}
