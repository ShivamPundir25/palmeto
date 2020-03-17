package Employee;

public class Employee
{
long employeeId;
String employeeName;
String employeeAddress;
Long Phone;
double basicSalary;
double specialAllowance=250.80;
double Hra=1000.50;
Employee(long Id,String Name,String address, long phone)
    {
	employeeId=Id;
	employeeName=Name;
	employeeAddress=address;
	Phone=phone;
	}
void calculateSalary()
{
	
	double salary=basicSalary + (basicSalary*specialAllowance)+ (basicSalary*Hra/100);
	System.out.println(salary);
}

}


// child class manager


class Manager extends Employee{
	Manager(long Id,String Name,String address, long phone,double salary)
	{
		super(Id,Name,address,phone);
		employeeId=Id;
		employeeName=Name;
		employeeAddress=address;
		Phone=phone;
		basicSalary=salary;
	}
}

// child class trainee

class Trainee  extends Employee{
	Trainee(long Id,String Name,String address, long phone,double salary)
	{ 
		super(Id,Name,address,phone);
		employeeId=Id;
		employeeName=Name;
		employeeAddress=address;
		Phone=phone;
		basicSalary=salary;
	}
}