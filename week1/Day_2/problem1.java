package week1.Day_2;
import java.util.HashMap;
import java.util.Scanner;

public class problem1 {
     public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int x=target-nums[i];
            if(mp.containsKey(x)) return new int[]{i,mp.get(x)};
            else mp.put(nums[i],i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of an array");
        int n=sc.nextInt();
        System.out.println("enter elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter target");
        int target=sc.nextInt();
        int ans[]=new int[2];
        ans=twoSum(arr,target);
        for(int i=0;i<2;i++){
            System.out.print(ans[i]+" ");
        }
            sc.close();
    }
}
