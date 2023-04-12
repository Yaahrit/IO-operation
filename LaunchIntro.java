class Student
{
	private String name;
	private int age;
	private String city;
	
	public Student(String name,int age,String city)
	{
		this.name = name;
		this.age = age;
		this.city = city;
	}
	public String toString()
	{
		return " | Name | : " + name + " | Age | :" + age + " | city |:"+ city;	
	}
}
public class LaunchIntro
{

	public static void main(String args[])
	{
		Student s1 = new Student("Sayista",23,"Muzaffarpur");
		System.out.println(s1);

		System.out.println("********************************************");

		Student s2 = new Student("Simiran",27,"Delhi");
		System.out.println(s2);
	}
}