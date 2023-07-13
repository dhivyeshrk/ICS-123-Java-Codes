import java.util.Scanner;
import java.lang.Math;
public class CentralCity {
    public static double getDistance(double x1, double y1, double x2, Double y2)
    {
        double d = (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2);
        return Math.sqrt(d);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of cities: ");
        int city = sc.nextInt(); //number of cities.
        System.out.print("Enter the coordinates of the cities: ");
        double[][] cd = new double[city][2]; //stores the coordinates. 
        for(int i=0;i<city;i++)
        {
            for(int j=0;j<2;j++)
            {
                cd[i][j]=sc.nextDouble();
            }
        }
        double dis[] = new double[city]; //stores the sum of distances from each city to other cities.
        double sum;
        for(int i=0;i<city;i++)
        {
            sum=0;
            for(int j=0;j<city;j++)
            {
                sum+=getDistance(cd[i][0], cd[i][1], cd[j][0], cd[j][1]);
            }
            dis[i]=sum;
        }
        double min=dis[0];
        int ind=0, i=0;
        for(i=0;i<city;i++)
        {
            if(dis[i]<min) {
                min=dis[i];
                ind = i;
            }
        }
        System.out.println("The central city is at (" + cd[ind][0] + ", " + cd[ind][1] + ")");
        System.out.println("The distance to all other cities is " + String.format("%.2f", dis[ind]));
    }
}
