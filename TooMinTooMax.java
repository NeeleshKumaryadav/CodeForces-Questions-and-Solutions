import java.util.*;
public class TooMinTooMax {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int[] arr= new int[n];
            int i,j,k,l;
            for(i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            if(n<4)
                System.out.println(0);
            else{
                Arrays.sort(arr);
                i=arr[0];
                j=arr[n-1];
                k=arr[1];
                l=arr[n-2];
                int ans=Math.abs(i-j)+Math.abs(j-k)+Math.abs(k-l)+Math.abs(l-i);
                System.out.println(ans);
            }
            t--;
        }
        sc.close();
    }
}
