package BaekJoon_Level6;
import java.io.*;
import java.util.StringTokenizer;
public class ReapeatString {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int n=Integer.parseInt(br.readLine());
        String[]array=new String[n];
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine()," ");
            int a=Integer.parseInt(st.nextToken());
            String str=st.nextToken();
            
            for(int k=0;k<str.length();k++){
                for(int j=0;j<a;j++){
                    array[i]=(array[i]+str.charAt(k));
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int k=4;k<array[i].length();k++){
                System.out.print(array[i].charAt(k));
            }
            System.out.println();
        }
        br.close();
    }
}
