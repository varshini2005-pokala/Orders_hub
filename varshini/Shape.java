import java.util.scanner;
class Shape
{
int dim1,dim2;
scanner sc=new
scanner(System.in);
void printArea()
{
}
}
class Rectangle extends Shape
{
void printArea()
{
System.out.println("Enter dimensions for Rectangle:");
System.out.print("Length: ");
dim1=sc.nextInt();
System.out.print("bredth: ");
dim2=sc.nextInt();
System.out.println("Area of rectangle":+(dim1*dim2));
}
}
class Triangle extends Shape
{
void printArea()
{
System.out.println("Enter dimentions for Triangle:");
System.out.print("Base :");
dim1=sc.nextInt();
System.out.print("height :");
dim2=sc.nextInt();
System.out.println("Area of Triangle":+(0.5*dim1*dim2);
}
}class Circle extends Shape
{
void printArea()
{
System.out.println(Enter dimentions for Circle:");
System.out.print("radius :");
dim1=sc.nextInt();
System.out.println("Area of Circle":+(math.PI*dim1*dim1));
}
}
class ShapeTest
{
public static void main(Strin args[])
{
Rectangle r=new Rectangle();
r.printArea();
Triangle t=new Triangle();
t.printArea();
Circle c=new Circle();
c.printArea();
}
}
