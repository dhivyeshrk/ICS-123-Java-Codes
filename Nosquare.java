//JesusLovesYou
import java.util.Scanner;
public class Nosquare{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1=n/2;
        int arr[] = new int[n1];
        int ind=0;
        for(int i=0;i<n1;i++)
        {
            arr[i]=i*i;
        }                               
        for(int i=0;i<n;i++)
        {
            if(i==arr[ind]){
                ind+=1;
            }
            else{
                System.out.print(i + " ");
            }
        }
        
    }
}