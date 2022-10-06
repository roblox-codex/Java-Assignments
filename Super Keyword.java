class Faculty
{
	// declaring display method parent class
	void display()
	{
		System.out.println("Faculty of NFSU");
	}
}
// child class extending parent class
class Student extends Faculty
{
	// declaring display method in Child class
	void display()
	{
		System.out.println("Student of NFSU");
	}
	void print()
	{
		// invoking display method from parent class
		super.display();
		// display method from child class
		display();
	}
}
public class Main 
{
    public static void main(String[] args) 
	{
    	// creating instance of child class
    	Student obj = new Student();
    	obj.print();
    }
} 
