import java.util.*;
public class problem2 {
    public static int helper(int nums[]){
         if(nums.length==0) return 0;
          int index=1;
          for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
            nums[index++]=nums[i];
             }
         }
    return index;
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
        int k=helper(arr);
        System.out.println("The no of unique element in array is:"+k);
            sc.close();
    }
}
