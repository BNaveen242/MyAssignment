package week1.day1;
//Class 
public class Mobile 
{
	//Method 1
	public void sendSms()
	{
		System.out.println("Hello Everyone");
	}
	//Method 2
	public void snapShot()
	{
		System.out.println("Bye Everyone");
	}
	//Method3
	public void Camera()
	{
		System.out.println("Nice pic");
	}

	public static void main(String[] args)
	{
		Mobile Naveen = new Mobile();
		Naveen.sendSms();
		Naveen.snapShot();
		Naveen.Camera();
	}
}
