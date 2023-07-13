import java.util.Scanner;

public class Markov_Matrix_Check{
    public static boolean isMarkovMatrix(double[][] m) {
        int n = 3;
        double sum=0.0;
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j < n; j++) {
                sum += m[j][i];
                if (m[j][i] >= 0) {
                    continue;

                } else {
                    return false;
                }
            }
            if(sum==1.0)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=3;
        double[][] arr = new double[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextFloat();
            }
        }        
        System.out.println(isMarkovMatrix(arr));
    }
}