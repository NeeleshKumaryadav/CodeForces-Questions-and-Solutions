
import java.util.*;
public class Equalize{

    public static int binarySearch(int st,int end,List<Integer> nums,int key){
        int mid=st+(end-st)/2;
        while(st<=end){
            if(nums.get(mid)==key)
                return mid;
            else if(nums.get(mid)<key)
                st=mid+1;
            else
                end=mid-1;
            mid=st+(end-st)/2;
        }
        return end;
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        for(int k=0;k<t;k++){

            int n=sc.nextInt();
            int[] arr= new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            Set<Integer> s=new HashSet<>();
            List<Integer> nums=new ArrayList<>();

            for(int i=0;i<n;i++){
                s.add(arr[i]);
            }
            
            for(Integer num :s){
                nums.add(num);
            }

            Collections.sort(nums);

            int m=nums.size();
            int ans=0;
            for(int i=0;i<m;i++){
                int ind = binarySearch(i,m-1,nums,nums.get(i)+n-1);
                
                ans=Math.max(ans,ind-i+1);
            }
            System.out.println(ans);
        }
    }
}