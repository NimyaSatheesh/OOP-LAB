import java.util.Scanner;
class areaShapes{
    void area(int a){
        System.out.println("area of square is "+a*a);
    }
    void area(int a, int b){
        System.out.println("area of rectangle "+a*b);
    }
    void area(int length, int breadth, int height){
        System.out.println("Area of Cuboid "+(2*(length*breadth)+2*(length*height)+2*(height*breadth)));

    }
}
public class Area {
    public static void main(String[] args) {
        int a,b,c;
        Scanner s= new Scanner(System.in);
        areaShapes obj=new areaShapes();
        System.out.println("enter the side of square");
        a= s.nextInt();
        obj.area(a);
        System.out.println("enter the length and breadth");
        a=s.nextInt();
        b=s.nextInt();
        obj.area(a,b);
        System.out.println("enter the length, breadth and height of a cuboid");
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        obj.area(a,b,c);
    }
}
