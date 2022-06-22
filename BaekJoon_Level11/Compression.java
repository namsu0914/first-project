package BaekJoon_Level11;
import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;
public class Compression {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());

        StringTokenizer st;
        st=new StringTokenizer(br.readLine()," ");
        int arr[]=new int[t];
        for(int i=0;i<t;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int result[]=new int[t];

        for(int i=0;i<t;i++){
            int same[]=new int[t];
            for(int j=0;j<t;j++){
                if(i!=j){
                    if(arr[i]>arr[j]){
                        int box=arr[j];
                        if(Arrays.stream(same).anyMatch(k->k==box)){

                        }else{
                            result[i]++;
                            same[j]=arr[j];
                        }
                        
                    }
                }
            }

        }
        for(int i=0;i<t;i++){
            System.out.printf("%d ",result[i]);
        }
    }
}
