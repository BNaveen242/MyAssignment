package week1.day1;

public class AndroidMobile {
	public void makeCall()
	{
		String MobileModel="Samsung";
	    float MobileWeight=4.5f;
	    System.out.println("My Mobile Model is :"+ MobileModel);
	    System.out.println("My Mobile Weight is :"+ MobileWeight);
	}
 public void sendSms()
 {
	 boolean ChargeFull=true;
	 int MobileRate = 20000;
	 System.out.println("My Mobile ChargeFull is :"+ ChargeFull);
	 System.out.println("My Mobile Rate is :"+ MobileRate);
 }
 public static void main(String[] args)
 {
	 AndroidMobile Am = new AndroidMobile();
	 Am.makeCall();
	 Am.sendSms();
	 System.out.println("THIS IS MY MOBILE");
 }
}
