package BaekJoon_Level6;
import java.io.*;
import java.util.StringTokenizer;
public class Constant {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st=new StringTokenizer(br.readLine()," ");
        String str1=st.nextToken();
        String str2=st.nextToken();
        String str3="";
        String str4="";

        for(int i=2;i>=0;i--){
            str3=str3+str1.charAt(i);
        }
        for(int i=2;i>=0;i--){
            str4=str4+str2.charAt(i);
        }
        if(Integer.parseInt(str3)>Integer.parseInt(str4)){
            System.out.println(str3);
        }else{
            System.out.println(str4);
        }
    }
}
