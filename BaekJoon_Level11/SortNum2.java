package BaekJoon_Level11;
import java.io.*;
import java.util.Arrays;
public class SortNum2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t=Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[t];         
        for (int i = 0; i < t; i++) {            
            arr[i] = Integer.parseInt(br.readLine());        
            }         
        Arrays.sort(arr);         
        for (int i = 0; i < t; i++) {            
            sb.append(arr[i]).append('\n');        
        }        
        System.out.println(sb);

    }
}
