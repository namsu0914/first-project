package BaekJoon_Level10;
import java.io.*;
public class Movie {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int i=0,j=665;
        while(i!=N){ //N번째 666포함 수 찾기
            j++; //정수 1씩 증가하면서 하나하나 찾기
            String s=Integer.toString(j); //문자열로 변환
            if(s.contains("666")){   
                i++;
            }
        }
        System.out.println(j);
    }
}
