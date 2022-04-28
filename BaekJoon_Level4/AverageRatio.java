package BaekJoon_Level4;
import java.io.*;
import java.io.IOException;
import java.util.StringTokenizer;
public class AverageRatio {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int n=Integer.parseInt(br.readLine());
        float[]aver=new float[n];
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine()," ");
            int a=Integer.parseInt(st.nextToken());
            int[]score=new int[a];
            for(int k=0;k<a;k++){
                score[k]=Integer.parseInt(st.nextToken());
            }
            int sum=0;
            double average=0.0;
            for(int k=0;k<a;k++){
                sum+=score[k];
            }
            average=sum/a;
            int stu=0;
            for(int k=0;k<a;k++){
                if(score[k]>average)
                    stu++;
            }
            aver[i]=(float)stu*100/a;
        }
        for(int i=0;i<n;i++){
            System.out.printf("%2.3f",aver[i]);
            System.out.println("%");
        }
    }
}
