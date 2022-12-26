package week1.day1;

public class ClassCalculator 
{
	//Addition
	public int add1(int a,int b)
	{
		return a+b;
	}
    public double add2(int a,double b,double c)
    {
    	return a+b+c;
    }
    
    //Subtraction
    public int sub1(int a,int b)
	{
		return a-b;
	}
    public double sub2(int a,double b)
    {
    	return a-b;
    }
    
    //Multiplication
    public int mul1(int a,int b)
   	{
   		return a*b;
   	}
    public double mul2(int a,double b)
    {
       	return a*b;
    }
    
    //Divition
    public int div1(int a,int b)
   	{
   		return a/b;
   	}
    public double div2(int a,double b)
    {
       	return a/b;
    }
    
	public static void main(String[] args)
	{
		ClassCalculator cc = new ClassCalculator();
		//Add 1
		double Addition=cc.add1(4,2);
		System.out.println(Addition);
		//Add 2
		System.out.println(cc.add2(5, 5, 5));
		
		//Sub 1
		double Subtraction=cc.sub1(4,2);
		System.out.println(Subtraction);
		//Sub 2
		System.out.println(cc.sub2(5,5));
		
		//Mul 1
		double Multiplication=cc.mul1(4,2);
		System.out.println(Multiplication);
		//Mul 2
		System.out.println(cc.mul2(5,5));
		
		//Div 1
		double Divition=cc.div1(4,2);
		System.out.println(Divition);
		//Div 2
		System.out.println(cc.div2(5,5));
	}

}
