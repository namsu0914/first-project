package BaekJoon_Level10;
import java.io.*;
import java.util.StringTokenizer;
public class Chess {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st=new StringTokenizer(br.readLine()," ");
        int M=Integer.parseInt(st.nextToken());
        int N=Integer.parseInt(st.nextToken());
        boolean[][]chs=new boolean[M][N];
        for(int i=0;i<M;i++){
            String s=br.readLine();
            for(int j=0;j<N;j++){
                if(s.charAt(j)=='W'){
                    chs[i][j]=true;
                }else{
                    chs[i][j]=false;
                }
                
            }
        }
        int reDraw=0;
        for(int i=0;i<M-7;i++){
            
            for(int j=0;j<N-7;j++){
                int count=0;
                boolean TF=chs[i][j];
                for(int i2=i;i2<i+8;i2++){
                    for(int j2=j;j2<j+8;j2++){
                        if(chs[i2][j2]!=TF){
                            count++;
                        }
                        TF=(!TF);
                    }
                    TF=(!TF);
                }
                count=Math.min(count, 64-count);
                if(i==0&&j==0){
                    reDraw=count;
                }else{
                    reDraw=Math.min(count, reDraw);
                }
                
            }
        }
        System.out.println(reDraw);
    }
}
