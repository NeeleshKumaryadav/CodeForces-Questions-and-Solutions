import java.util.*;

public class RectangleCutting{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        int t=sc.nextInt();
        for(int k=0;k<t;k++){
            int a=sc.nextInt();
            int b=sc.nextInt();

            if(a%2==1 && b%2==1){
                System.out.println("NO");
            }
            else{
                if(a%2==0 && b%2==0){
                    System.out.println("YES");
                }
                else if((a%2==1 && b==a*2) || (b%2==1 && a==b*2)){
                    System.out.println("NO");
                }
                else{
                    System.out.println("YES");
                }
            }
        }
        

    }
}