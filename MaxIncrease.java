import java.util.*;
public class MaxIncrease {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int len=1;
        int count=1;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                count++;
            } else{
                len = Math.max(len,count);
                count=1;
            }
        }
        len =Math.max(count,len);

        System.out.println(len);


        sc.close();
    }
}
