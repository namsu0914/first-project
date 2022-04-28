package BaekJoon_Level4;

import java.io.IOException;
import java.io.*;
public class OX {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String ar;
        int n=Integer.parseInt(br.readLine());
        int sum=0,k=1;
        int[]array =new int[n];
        for(int i=0;i<n;i++){
            sum=0;
            k=1;
            ar=br.readLine();
            for(int j=0;j<ar.length();j++){
                if(ar.charAt(j)=='O'){
                    sum+=k;
                    k++;
                }
                else if(ar.charAt(j)=='X'){
                    k=1;
                }
            }
            array[i]=sum;
        }
        for(int i=0;i<n;i++){
            System.out.println(array[i]);
        }
        br.close();
    }
}
