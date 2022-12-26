package week1.day1;

public class Car
{
 public void applyBreak() 
 {
	System.out.println("Sound Horn in Car");
 }
 public void soundHorn() 
 {
	System.out.println("Sound Horn in Car");
 }
 public static void main(String[] args)
 {
 	Car c1=new Car();
 	c1.applyBreak();
 	c1.soundHorn();
 	Bike b1=new Bike();
 	b1.applyBreak1();
 	b1.soundHorn1();
}
}
class Bike
{ 
public void applyBreak1() 
{
	System.out.println("Apply Break in Bike");
}

public void soundHorn1() 
{
	System.out.println("Sound Horn in Bike");
}
}

