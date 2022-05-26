package BaekJoon_Level10;
import java.io.*;
import java.util.StringTokenizer;
public class BodyRanking {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N=Integer.parseInt(br.readLine());
        int[][]arr=new int[N][4];
        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine()," ");
            arr[i][0]=Integer.parseInt(st.nextToken());
            arr[i][1]=Integer.parseInt(st.nextToken());
            arr[i][2]=0;
            arr[i][3]=1;
        }
        for(int i=0;i<N-1;i++){
            for(int j=i+1;j<N;j++){
                if(arr[i][0]>arr[j][0]){
                    if(arr[i][1]>arr[j][1]){
                        arr[i][2]++;
                    }
                }else if(arr[i][0]<arr[j][0]){
                    if(arr[i][1]<arr[j][1]){
                        arr[j][2]++;
                    }
                }
            }
        }
        
        for(int i=0;i<N-1;i++){
            for(int j=i+1;j<N;j++){
                if(arr[i][2]>arr[j][2]){
                    arr[j][3]++;
                }else if(arr[i][2]<arr[j][2]){
                    arr[i][3]++;
                }
            }
        }
        for(int i=0;i<N;i++){
            System.out.print(arr[i][3]+" ");
        }
    }
}
