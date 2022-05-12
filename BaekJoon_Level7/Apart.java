package BaekJoon_Level7;
import java.io.*;
public class Apart {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            int k=Integer.parseInt(br.readLine());
            int n=Integer.parseInt(br.readLine());
            func(k,n);
        }
    }
    private static void func(int k,int n){
        int[][]ap=new int[k+1][n+1];
        for(int i=0;i<n+1;i++){
            ap[0][i]=i;
        }
        for(int i=0;i<k+1;i++){
            ap[i][0]=0;
            ap[i][1]=1;
        }
        for(int i=1;i<k+1;i++){
            for(int j=2;j<n+1;j++){
                ap[i][j]=ap[i][j-1]+ap[i-1][j];
            }
        }
        System.out.println(ap[k][n]);
    }
}
