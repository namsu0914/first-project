package BaekJoon_Level3;
import java.io.*;

public class MakesStars02 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t=Integer.parseInt(br.readLine()); 
        
        for(int i=0;i<t;i++){
            for(int j=1;j<t-i;j++){
                bw.write(" ");
            }
            for(int j=0;j<i+1;j++){
                bw.write("*");
            }
            bw.write("\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
