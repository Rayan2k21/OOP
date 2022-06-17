class AditionA

{
	int x;
	int y;

	void add()
	{
	System.out.print(x+y);
	}
}
class A extends AditionA
{

}
public class Lab8
{
	public static void main(String args[])
{
	A P=new A();
P.x=10;
P.y=20;
P.add();
}

  }
