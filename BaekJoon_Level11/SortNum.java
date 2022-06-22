package BaekJoon_Level11;
import java.io.*;
public class SortNum {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int []arr=new int[t];
        for(int i=0;i<t;i++){
            if(i==0){
                arr[0]=Integer.parseInt(br.readLine());
            }else{
                int n=Integer.parseInt(br.readLine());
                for(int k=0;k<i;k++){
                    if(n<arr[k]){
                        for(int j=i;j>k;j--){
                            arr[j]=arr[j-1];
                        }
                        arr[k]=n;
                        break;
                    }else if(arr[i-1]<n){
                        arr[i]=n;
                    }
                }
            }
           
        }
        for(int i=0;i<t;i++){
            System.out.println(arr[i]);
        }
    }
}
