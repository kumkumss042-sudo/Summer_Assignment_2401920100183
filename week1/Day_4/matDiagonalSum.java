package Summer_Assignment_2401920100183.week1.Day_4;
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int n=mat.length,m=mat[0].length;
        int i=0,j=0,k=0,l=m-1;
        while(i<n && j<m && k<n && l<m){
            sum+=mat[i][j];
            sum+=mat[k][l];
            i++;j++;
            k++;l--;
        }
        if(n%2!=0) sum-=mat[n/2][n/2];
        return sum;
    }
}