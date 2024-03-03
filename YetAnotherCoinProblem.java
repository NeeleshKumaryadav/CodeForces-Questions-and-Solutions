import java.util.*;
public class YetAnotherCoinProblem {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        int[] coins={15,10,6,3,1};
        int[] ans={0,1,2,1,2,3,1,2,3,2,1,2,2,2,3};
        while(t>0){
            long n=sc.nextInt();
            long coin;
            if(n<15){
                coin= ans[(int)n];
            }
            else if(n%15==5){
                coin=n/15+1;
            } else if(n%15==8){
                coin= n/15+2;
            } else{
                coin = n/15 + ans[(int)n%15];
            }
            System.out.println(coin);
            t--;
        }
        sc.close();
    }
}
