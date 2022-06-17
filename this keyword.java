class Adition

{
	int x,y;
	Adition()

	
	{
		x=10;	
		y=20;
	}
		Adition(int x,int y)
	{
	this.x=x;
	this.y=y;
	}
}
public class Lab8
{
	public static void main(String args[])
{
	Adition P=new Adition(40,60);
	System.out.print(P.x+P.y);
}

  }
