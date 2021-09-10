import java.util.Scanner;
class Employee2 
{
    int Empid;
    String Name;
    float Salary;
    String Address;
    
    Employee2()
    {
        
    }
    public Employee2(int id, String name, float sal, String addr)
    {
        Empid = id;
        Name = name;
        Salary = sal;
        Address = addr;
    }
    
}
class Teacher extends Employee2
{
    String department;
    String Subjects;

    public Teacher(int id, String name, float sal, String addr, String dept, String sub) 
    {
        super(id, name, sal, addr);
        department = dept;
        Subjects = sub;
        
    }

    Teacher() 
    {
      
    }

    public void display()
    {
        System.out.println("Employee ID - "+Empid);
        System.out.println("Employee Name - "+Name);
        System.out.println("Salary - "+Salary);
        System.out.println("Address - "+Address);
        System.out.println("Department - "+department);
        System.out.println("Subject - "+Subjects);
    }
    
}
public class inheritance_employee {
    public static void main(String[] args) 
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Teachers to be added:");
        n = sc.nextInt();
        Teacher obj[] = new Teacher[n];
        for (int i=0; i<n; i++) 
        {
            obj[i] = new Teacher();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("\t*****");
            System.out.println("Enter Employee ID");
            obj[i].Empid = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Employee Name");
            obj[i].Name = sc.nextLine();
            System.out.println("Enter Employee Salary");
            obj[i].Salary = sc.nextFloat();
            sc.nextLine();
            System.out.println("Enter Employee Address");
            obj[i].Address = sc.nextLine();
            System.out.println("Enter Employee Department");
            obj[i].department = sc.nextLine();
            System.out.println("Enter Employee Subject");
            obj[i].Subjects = sc.nextLine();
        }
        System.out.println("\t***************");
        System.out.println("Employee Details:-");
        for(int i=0;i<n;i++)
            obj[i].display();
    }
    
}
