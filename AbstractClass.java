abstract class vehicle
{
  int no_of_tyres;
  abstract void start();
}
class car extends vehcile
{
   void start()
{   
    System.out.print("car start with key");
 }
}
class motorbike extends vehcile
{
  void start()
{ 
  System.out.print("motorbike start with kick")
}
}
public class AbstractClass.java
{
 public static void main(String args[])
{
 car c=new car();
 c.no_of_tyres=4;
 System.out.print(c.no_of_tyres);
 c.start();
 motorbike m=new motorbike ();
 m.no_of_tyres=4;
 system.out.print(m.no_of_tyres);
 m.start();
}
}
