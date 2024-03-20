import java.util.*;

public class CPlusEquals{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            long a,b,n;
            a=sc.nextInt();
            b=sc.nextInt();
            n=sc.nextInt();

            long[] p=new long[2];
            long[] q=new long[2];

            p[0]=1;
            p[1]=1;
            q[1]=1;

            
            if(a+b>n)
                System.out.println(1);
            else{
                long x=0,y=0;
                long temp,count=0;

                while(x<=n && y<=n){
                    x=a*p[1]+b*q[1];
                    y=b*p[1]+a*q[1];

                    temp=p[0];
                    p[0]=p[1];
                    p[1]=p[0]+temp;

                    temp=q[0];
                    q[0]=q[1];
                    q[1]=q[0]+temp;
                    
                    count++;
                }

                System.out.println(count);
            }

            t--;
        }



        sc.close();
    }
}