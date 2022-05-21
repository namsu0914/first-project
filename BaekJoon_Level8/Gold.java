package BaekJoon_Level8;
import java.io.*;
public class Gold {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            int index=0;
            int n=Integer.parseInt(br.readLine());
            for(int j=2;j<=n/2;j++){
                if(prime(j)==0 && prime(n-j)==0){
                    index=j;
                }
            }
            System.out.println(index+" "+(n-index));
        }
    }
    private static int prime(int n){
        int ind=0;
        int result=-1;
        int root=(int)Math.sqrt(n)+1;
        for(int k=2;k<root;k++){
            if(n%k==0){
                ind++;
                break;
            }
        }
        if(ind==0){
            result=0; //소수
        }
        else{
            result=1; //소수 아님
        }
        return result;        
    }
    
}
