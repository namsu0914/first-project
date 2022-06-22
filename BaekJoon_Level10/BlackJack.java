package BaekJoon_Level10;
import java.io.*;
import java.util.StringTokenizer;
public class BlackJack {
    public static void main(String[] args)throws IOException {
        System.out.println(cardGame());
    }
    private static int cardGame()throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int result=0;
        st=new StringTokenizer(br.readLine()," ");
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());

        int[]num=new int[N];
        st=new StringTokenizer(br.readLine()," ");
        for(int i=0;i<N;i++){
            num[i]=Integer.parseInt(st.nextToken());
        }
        for(int i=0;i<=(N-3);i++){
            for(int j=i+1;j<=(N-2);j++){
                for(int k=j+1;k<=(N-1);k++){
                    if((num[i]+num[j]+num[k])>M){
                         //안되면 고칠 곳
                    }else if((M-(num[i]+num[j]+num[k]))<M-result){
                        result=num[i]+num[j]+num[k];
                    }
                }
            }
        }
        return result;
    }
}