package methodOverriding.com;

public class TriangleAbstr extends AbstractShape{
	int side1;
	int side2;
	int side3;
	TriangleAbstr(int side1,int side2,int side3)
	{
		this.side1=side1;
		this.side2 =side2;
		this.side3=side3;
	}
	public void calculateArea()
	{
		area = (side1*side2)/2;
	}
    public void calculatePerimeter()
    {
    	perimeter =  side1+side2+side3;
    }
    public void setSides()
    {
    	sides =3;
    }
}
