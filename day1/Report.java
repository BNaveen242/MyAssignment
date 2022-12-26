package week1.day1;
class Student
{
	public void variable()
	{
		String StudentName="Naveen";
		int RollNo=007;
		String CollegeName="St.Josheph";
		int MarkScored=733;
		float Cgpa=6.4f;
		System.out.println("Entered Student Name is :\n"+StudentName);
		System.out.println("Entered Student RollNo is :\n"+RollNo);
		System.out.println("Entered Student CollegeName is :\n"+CollegeName);
		System.out.println("Entered Student MarkScored is :\n"+MarkScored);
		System.out.println("Entered Student Cgpa is :\n"+Cgpa);	
	}
}
public class Report
{
	public static void main(String[] args)
	{
	Student Sd = new Student();
	Sd.variable();
	}
}

