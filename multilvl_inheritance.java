import java.util.*;

class Person
{
	String name,gender,address;
	int age;
	
	public Person()
	{
		Scanner inp1 = new Scanner(System.in);
		System.out.println("Enter Name : ");
		name = inp1.next();
		System.out.println("Enter Age : ");
		age = inp1.nextInt();
		System.out.println("Enter Gender : ");
		gender = inp1.next();
		System.out.println("Enter Address : ");
		address = inp1.next();
		
		
	}
}

class Employee extends Person
{
	int empid,salary;
	String qual,c_n;
	
	public Employee()
	{
		Scanner inp2 = new Scanner(System.in);
		System.out.println("Enter Emp_id : ");
		empid = inp2.nextInt();
		System.out.println("Enter Salary : ");
		salary = inp2.nextInt();
		System.out.println("Enter Qualification : ");
		qual = inp2.next();
		System.out.println("Enter Company Name : ");
		c_n = inp2.next();
		
	}
}

class Teacher extends Employee
{
	String sub,dept;
	int t_id;
	
	public Teacher()
	{
		Scanner inp3 = new Scanner(System.in);
		System.out.println("Enter Teacher_id : ");
		t_id = inp3.nextInt();
		System.out.println("Enter Subject: ");
		sub = inp3.next();
		System.out.println("Enter Department : ");
		dept = inp3.next();
		
	}
	
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Gender : "+gender);
		System.out.println("Address : "+address);
		System.out.println("Emp id : "+empid);
		System.out.println("salary : "+salary);
		System.out.println("Qualification : "+qual);
		System.out.println("Company Name : "+c_n);
		System.out.println("Teacher id : "+t_id);
		System.out.println("Subject : "+sub);
		System.out.println("Department : "+dept);
		
		
	}
}

public class multilvl_inheritance {
    public static void main(String args[])
	{
		int no;
		
		Scanner inp4 = new Scanner(System.in);
		System.out.println("Enter no of teachers : ");
		no = inp4.nextInt();
		
		Teacher[] obj = new Teacher[no];
		
		for(int i=0;i<no;i++)
		{
			obj[i] = new Teacher();
		}
		
		 for(int i=0;i<no;i++)
		    {
		    	System.out.println("\nDetails of Employee  No : " + (i+1));
		    	obj[i].display();
		    }
		
		
	}
}
