class Addition
{
int x,y;

Addition(int a,int b)
{
x=a;
y=b;
}

}

class Methodoverloading
{
public static void main(String args[])
{
Addition p= new Addition(30,40);

System.out.print(p.x+p.y);
}
}
