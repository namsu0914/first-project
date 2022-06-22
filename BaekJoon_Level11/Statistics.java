package BaekJoon_Level11;
import java.io.*;
import java.util.Arrays;
public class Statistics {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int[] arr = new int[t];      
        for (int i = 0; i < t; i++) {            
            arr[i] = Integer.parseInt(br.readLine());        
        }
        Arrays.sort(arr); 
        int[] res=new int[4];
        for(int i=0;i<t;i++){
            res[0]+=arr[i];
        }
        res[0]=Math.round(res[0]/t);
        res[0]=res[0]/t;

        res[1]=arr[t/2]; //중앙값
        int count=0;
        for(int i=0;i<t-1;i++){
            if(arr[i]==arr[i+1]){

            }
        }

        res[3]=arr[t-1]-arr[0]; //범위

        for(int i=0;i<4;i++){
            System.out.println(res[i]);
        }
    }
}
