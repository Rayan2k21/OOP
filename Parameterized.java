class Parametrize
{
	int x,y;
	A(int a,int b)

	{
		x=a;y=b;
	}
		void man()
	{
		System.out.print(x+" "+y);
	}
}
class B
{
	public static void main(String args[])
{
	A r=newA(100,200);
	r.show();
}
}
