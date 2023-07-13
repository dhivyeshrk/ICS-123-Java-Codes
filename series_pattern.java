import java.util.Scanner;
public class series_pattern
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n-1;i>=0;i--)
        {
            for(int j=i;j>=0;j--)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}