package BaekJoon_Level6;
import java.io.*;
import java.lang.*;
public class WordStudy {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        String str2=str.toUpperCase();
        int[]n=new int[26];
        for(int i=0;i<26;i++){
            n[i]=0;
        }
        for(int i=0;i<str2.length();i++){
            n[(int)str2.charAt(i)-65]++;
        }
        int biggest=0;
        int biggesti=0;
        int j=0;
        for(int i=0;i<26;i++){
            if(n[i]>biggest){
                biggest=n[i];
                biggesti=i;
            }
        }
        for(int i=0;i<26;i++){
            if(n[i]==biggest){
                j++;
            }
        }
        if(j>1){
            System.out.println("?");
        }else{
            char ch=(char)(biggesti+65);
            System.out.println(ch);
        }
    }
        
}
