package BaekJoon_Level7;
import java.io.*;
import java.util.StringTokenizer;
public class ACMHotel {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st;

        int t=Integer.parseInt(br.readLine());
        int h=0,w=0,n=0;
        int room=0;
        for(int i=0;i<t;i++){
            st=new StringTokenizer(br.readLine()," ");
            h=Integer.parseInt(st.nextToken());
            w=Integer.parseInt(st.nextToken());
            n=Integer.parseInt(st.nextToken());
            if(n%h==0){
                room=h;
                room=room*100;
                room+=n/h;
            }else{
                room=n%h;
                room=room*100;
                room+=n/h+1;
            }
            System.out.println(room);
        }

    }
}
