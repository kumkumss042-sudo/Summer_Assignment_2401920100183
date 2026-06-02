package Summer_Assignment_2401920100183.week1.Day_1;
import java.util.*;

public class maxSubarray{
    public static int helper(int nums[]){
        //kandane's algorithm
        int sum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max=Math.max(sum,max);
            if(sum<0) sum=0; 
        }
        //when here max found then see test case [-1] here ans becomes 0 but ans is -1
        return max;
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
        int max=helper(arr);
        System.out.println("Largest Subarray sum is:"+max);
        sc.close();
    }
}