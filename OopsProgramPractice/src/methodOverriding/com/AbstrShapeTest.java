package methodOverriding.com;

public class AbstrShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		AbstractShape shape = new RectangleAbstr(20,30);
		shape.calculateArea();
		shape.calculatePerimeter();
    AbstractShape shape1 = new TriangleAbstr(10,20,30);
    shape1.calculateArea();
    shape1.calculatePerimeter();
    System.out.println("Area of the Rectangle :" + shape.area);
    System.out.println("Perimeter of the Rectangle: " + shape.perimeter);
    System.out.println("Area of the Triangle: " + shape1.area);
    System.out.println("Perimeter of the Triangle : " + shape1.perimeter);
	}

}
