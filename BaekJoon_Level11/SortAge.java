package BaekJoon_Level11;
import java.io.*;
import java.util.StringTokenizer;
public class SortAge {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        StringTokenizer st;

        String arr[][]=new String[t][2];
        for(int i=0;i<t;i++){
            st=new StringTokenizer(br.readLine()," ");
            arr[i][0]=st.nextToken();
            arr[i][1]=st.nextToken();

            
        }
    }
}
