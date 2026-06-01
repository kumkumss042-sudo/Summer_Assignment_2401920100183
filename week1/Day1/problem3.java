import java.util.Scanner;

public class problem3 {
    public static int helper(int[] prices) {
        int min=prices[0];
        int profit=0;
        for(int i=0;i<prices.length;i++){
         if(prices[i]<min) min=prices[i];
         profit=Math.max(prices[i]-min,profit);
        }
        return profit;
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
        int ans=helper(arr);
        System.out.println("The max profit is:"+ans);
        sc.close();
    }
}
