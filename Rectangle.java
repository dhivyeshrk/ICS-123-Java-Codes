import java.util.Scanner;
public class Rectangle {

    double width;
    double height;

    Rectangle() {
        width = 1.0;
        height = 1.0;
    }

    Rectangle(Double w, Double h) {
        width = w;
        height = h;
    }

    double getArea() {
        return this.height * this.width; // this can be omitted.
    }

    double getPerimeter() {
        double p = 2 * (this.height + this.width);
        return p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        Rectangle r1 = new Rectangle(w, h);
        w = sc.nextDouble();
        h = sc.nextDouble();
        Rectangle r2 = new Rectangle(w, h);
        
        if(r1.width % 1==0)
        {
            System.out.print((int)r1.width + " ");
        }
        else{
            System.out.print(r1.width + " ");
        }
        if(r1.height % 1==0)
        {
            System.out.print((int)r1.height + " ");
        }
        else{
            System.out.print(r1.height+ " ");
        }
        if(r1.getArea() % 1==0)
        {
            System.out.print((int)r1.getArea() + " ");
        }
        else{
            System.out.print(r1.getArea()+ " ");
        }
        if(r1.getPerimeter()% 1==0)
        {
            System.out.println((int)r1.getPerimeter() + " ");
        }
        else{
            System.out.println(r1.getPerimeter() + " ");
        }


        if(r2.width % 1==0)
        {
            System.out.print((int)r2.width + " ");
        }
        else{
            System.out.print(r2.width + " ");
        }
        if(r2.height % 1==0)
        {
            System.out.print((int)r2.height + " ");
        }
        else{
            System.out.print(r2.height+ " ");
        }
        if(r2.getArea() % 1==0)
        {
            System.out.print((int)r2.getArea() + " ");
        }
        else{
            System.out.print(r2.getArea()+ " ");
        }
        if(r2.getPerimeter()% 1==0)
        {
            System.out.println((int)r2.getPerimeter() + " ");
        }
        else{
            System.out.println(r2.getPerimeter() + " ");
        }
        //
        // // System.out.println("Rectangle R2");
        // System.out.print(r2.width+" ");
        // System.out.print(r2.height + " ");
        // System.out.print(r2.getArea() + " ");
        // System.out.println(r2.getPerimeter());
    }
}

