import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    //Problem 1
    Circle circ1 = new Circle(10.1);
    System.out.println(circ1.toString());

    Circle circ2 = new Circle(14);
    System.out.println(circ2.toString());

    Circle circ3 = new Circle(20.5);
    System.out.println(circ3.toString());

    //Problem 2 
    Scanner sc = new Scanner(System.in);
    System.out.println("Type a number for length and width: ");
    double rect1sidelw = sc.nextDouble();
    System.out.println("Type a length: ");
    double rect2l = sc.nextDouble();
    System.out.println("Type a width: ");
    double rect2w = sc.nextDouble();

    Rectangle rect1 = new Rectangle(rect1sidelw);
    Rectangle rect2 = new Rectangle(rect2l, rect2w);

    System.out.println(rect1.toString());
    System.out.println(rect2.toString());

    //Problem 3
    System.out.println("Type a side length: ");
    double polylength = sc.nextDouble();
    RegularPolygon tri = new RegularPolygon(polylength);
    RegularPolygon square = new RegularPolygon(4, polylength);
    
    System.out.println(tri.toString());
    System.out.println(square.toString());
  }
}
