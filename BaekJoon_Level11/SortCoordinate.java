package BaekJoon_Level11;
import java.io.*;
import java.util.StringTokenizer;
//comparator 활용안해도 됨..!!

import java.util.Arrays;
public class SortCoordinate {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n=Integer.parseInt(br.readLine());
        int[][] coor=new int[n][2];
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine()," ");
            coor[i][0]=Integer.parseInt(st.nextToken());
            coor[i][1]=Integer.parseInt(st.nextToken());
        }
        
    }
}
