package week1.day1;
public class Calculator 
{
	
	public void sub()
	{
		int a=20;
		int b=12;
		System.out.println(a-b);
	}
	
	public int mul(int Nav,int b)
	{
	 return(Nav*b);
	}

	public int div(int a,int b)
	{
	 return (a/b);
	}
	
	public static void main(String[] args) 
	{
	Calculator cal = new Calculator();
	cal.sub();
	
	int multiply=cal.mul(5,2);
	System.out.println(multiply);
	
	System.out.println(cal.div(4,2));
	}
}
