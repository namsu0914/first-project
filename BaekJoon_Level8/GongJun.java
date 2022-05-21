package BaekJoon_Level8;
import java.io.*;
public class GongJun {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
            int n=Integer.parseInt(br.readLine());
            if(n==0)
                break;
            int count=0;
            int ind=0;
            for(int i=n+1;i<=2*n;i++){
                int root=(int)Math.sqrt(i)+1;
                for(int j=2;j<root;j++){
                    if(i%j==0){
                        ind++;
                        break;
                    }
                }
                if(ind==0){
                    count++;
                }
                ind=0;
            }
            System.out.println(count);
        }
        
    }
}
