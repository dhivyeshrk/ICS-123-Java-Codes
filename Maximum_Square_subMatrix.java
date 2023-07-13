import java.util.Scanner;

public class Maximum_Square_subMatrix {
    public static int min(int a, int b, int c)
    {
        if(Math.min(a, b)==a){
            if(Math.min(a,c)==a) return a;
            else return c;
        }
        else{
            if(Math.min(b,c)==c) return c;
            else return b;
        }
    }
    public static void largest(int n, int[][] m)
    {
        int[][] A = new int[n][n];
        for(int i=0;i<n;i++)
        {
            A[i][0]=m[i][0];
            A[0][i]=m[0][i];
        }
        int max=0;
        int ind1=0;
        int ind2=0;
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(m[i][j]==0){
                    A[i][j]=0;
                }
                else if(m[i][j]==1){
                    A[i][j]=min(A[i-1][j], A[i-1][j-1], A[i][j-1]) + 1;
                }
                if(A[i][j]>max)
                {
                    max = A[i][j];
                    ind1=i;
                    ind2=j;
                } 
            }
        }
        System.out.println("The maximum square submatrix is at (" + (ind1-max+1) + ", " + (ind2-max+1) + ")" +
          " with size " + max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m[][] = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                m[i][j]=sc.nextInt();
            }
        }
        largest(n, m);
        
    }
}
