package Summer_Assignment_2401920100183.week1.Day_1;
import java.util.Scanner;

public class maxAvg {
    public static double helper(int nums[],int k){
         double sum=0;
        int left=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double max=sum;int right=k;
        while(right<nums.length){
                sum+=nums[right]-nums[left];
                 max=Math.max(max,sum);
                right++;
                left++;
        }
        double avg=max/k;
        return avg;
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
        System.out.println("enter value of k");
        int k=sc.nextInt();
        double avg=helper(arr,k);
        System.out.println("Contigous subarray whose length is k have max avg value is:"+avg);
        sc.close();
    }
}
