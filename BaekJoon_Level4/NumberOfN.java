package BaekJoon_Level4;

import java.io.*;
import java.io.IOException;

public class NumberOfN {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        
        int A=Integer.parseInt(br.readLine()); 
        int B=Integer.parseInt(br.readLine()); 
        int C=Integer.parseInt(br.readLine());

        int box=A*B*C;
        int one=0,two=0,three=0,four=0,five=0,six=0;
        int seven=0,eight=0,nine=0,zero=0;

        while(box!=0){
            if(box%10==0)
                zero++;
            else if(box%10==1)
                one++;
            else if(box%10==2)
                two++;
            else if(box%10==3)
                three++;
            else if(box%10==4)
                four++;
            else if(box%10==5)
                five++;
            else if(box%10==6)
                six++;
            else if(box%10==7)
                seven++;
            else if(box%10==8)
                eight++;
            else if(box%10==9)
                nine++;
            box=box/10;
        }
        bw.write(zero+"\n"+one+"\n"+two+"\n"+three+"\n"+four+"\n"+five+"\n"+six+"\n"+seven+"\n"+eight+"\n"+nine);
        br.close();
        bw.flush();
        bw.close();
    }
}
