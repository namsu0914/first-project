package BaekJoon_Level6;
import java.io.*;
public class GroupWord {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int numn=0;
        for(int i=0;i<n;i++){
            int num=0;
            String words=br.readLine();
            char[]check=new char[words.length()];
            int j=0;
            for(int k=0;k<words.length()-1;k++){
                if(words.charAt(k)!=words.charAt(k+1)){
                    for(int l=0;l<j;l++){
                        if(words.charAt(k)==check[l]){
                            num++;
                            break;
                        }
                    }
                    check[j]=words.charAt(k);
                    j++;
                    if(k==words.length()-2){
                        for(int l=0;l<j;l++){
                            if(words.charAt(k+1)==check[l]){
                                num++;
                                break;
                            }
                        }
                        check[j]=words.charAt(k+1);
                    }
                }
            }
            if (num>0)
                numn++;
        }
        System.out.println(n-numn);
    }
}
