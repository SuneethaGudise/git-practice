package methodOverriding.com;

public class RectangleAbstr extends AbstractShape{
	int len;
	int wid;
	RectangleAbstr(int len,int wid)
	{
		this.len = len;
		this.wid=wid;
	}
	public void calculateArea()
	{
		area=len*wid;
		
	}
	public void calculatePerimeter()
	{
		perimeter = 2 * (len+wid);
		
	}
	public void setSides()
	{
		 sides = 4;
	}
}
