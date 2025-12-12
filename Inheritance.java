class Employee
{
    String Employee_name;
    int Employee_id;
    private double Employee_basicSalary;

    public Employee(String name,int id,double basicsalary)
    {
        this.Employee_name=name;
        this.Employee_id=id;
        this.Employee_basicSalary=basicsalary;
    }

    public void displayInfo()
    {
        System.out.println("Employee name: "+this.Employee_name+"\nEmployee id: "+this.Employee_id+"\nEmployee basicSalary: "+this.Employee_basicSalary);
    }
    public double getEmployee_basicSalary()
    {
        return this.Employee_basicSalary;
    }
}

class Manager extends Employee
{
    String Employee_department;

    public Manager(String name,int id,double basicsalary,String department)
    {
        super(name,id,basicsalary);
        this.Employee_department=department;
    }

     public void displayInfo()
    {
        System.out.println("Employee name: "+this.Employee_name+"\nEmployee id: "+this.Employee_id+"\nEmployee Department: +"+this.Employee_department+"\nEmployee basicSalary: "+this.getEmployee_basicSalary());
    }

}
public class Inheritance {
    public static void main(String[] args) {

        Employee E1=new Employee("Tushar_Rajbongshi", 242002140, 4500);
        Employee E2=new Employee("Sojol_Rajbongshi", 742002144, 15000);
        Manager M1=new Manager("Krisno_Rajbongshi", 742002144, 35000,"Sampol");
        E1.displayInfo();
        E2.displayInfo();
        M1.displayInfo();

        
    }
    
}
