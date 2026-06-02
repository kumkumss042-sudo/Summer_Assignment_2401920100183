package Summer_Assignment_2401920100183.week1.Day_1;
import java.util.HashSet;
import java.util.Scanner;

public class containsDuplicate {
   public static boolean helper(int nums[]){
    
     HashSet<Integer>st=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(st.contains(nums[i])) return true;
            else st.add(nums[i]);
        }
        return false;

   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of an array");
        int n = sc.nextInt();
        System.out.println("enter elements");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean ans=helper(arr);
        System.out.println(ans);
        sc.close();
    }
}
