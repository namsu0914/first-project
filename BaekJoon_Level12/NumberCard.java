package BaekJoon_Level12;
import java.io.*;
import java.util.*;
public class NumberCard {
    public static void main(String[] args) throws IOException{
        Map<Integer, Integer>map=new HashMap<>();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());

        StringTokenizer st;
        st=new StringTokenizer(br.readLine()," ");
        for(int i=0;i<t;i++){
            map.put(Integer.parseInt(st.nextToken()),i);
        }

        int n=Integer.parseInt(br.readLine());
        StringTokenizer st2;
        st2=new StringTokenizer(br.readLine()," ");
        for(int i=0;i<n;i++){
            if(map.containsKey(Integer.parseInt(st2.nextToken()))){
                System.out.print("1 ");
            }else{
                System.out.print("0 ");
            }
        }
    }
}
