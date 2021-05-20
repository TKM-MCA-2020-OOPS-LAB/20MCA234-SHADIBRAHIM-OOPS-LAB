
import java.util.*;
  class Employee {
    int empid,salary;                         //datamembers of class Employee initialized
    string name,address;
    Employee()                                                  //default constructor
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter employee id/n");
        empid=s.nextInt();
        System.out.println("Enter employee Name /n");
        name=s.next();
        System.out.println("Enter employee Salary/n");
        salary=s.nextInt();
        System.out.println("Enter employee address /n");
        address=s.next();      
    }
    class Teacher extends Employee                                  //inheritance of class teacher(Single-level)
    {
        string dept,sub;
        Teacher();                                            //constrcutor of class teacher
        {
             Scanner t=new Scanner(System.in);
             System.out.println("Enter department Name /n");
             dept=t.next();
             System.out.println("Enter Subject  Name /n");
             sub=t.next();
        }
        public void display()
	{
		System.out.println("emp id : " + empid);
		System.out.println("name : " + name);
		System.out.println("address: " + address);
		System.out.println("salary : " + salary);
		System.out.println("department : " + dept);
		System.out.println("subject : " + sub);
		
	}

    }
   
}

public class inheritance {
    public static void main(String [] args)
	{
		int no;
		Scanner r = new Scanner(System.in);
		System.out.println("Enter no of teachers : ");
		no = r.nextInt();
		Teacher obj[] = new Teacher[no];   //number of employees is specified with the help of array
		
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

    
}
