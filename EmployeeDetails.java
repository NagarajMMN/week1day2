package week1day2;

public class EmployeeDetails {

	public static void printEmployeeName() {
		String empName="nagaraj";
		System.out.println(" "+empName);
	}
	public static void employeeAddress() {
		String empAddress="Chennai";
		System.out.println(" "+empAddress); 
	}
	public static void employeeSalary() {
		int salary=15000;
		System.out.println("  "+salary);
	}
	public static void employeeMobNO() {
		long MobNO=90001212;
		System.out.println(" "+MobNO);		
	}
	
public static void main(String[] args) {
	EmployeeDetails empl=new EmployeeDetails();
	empl.printEmployeeName();
	empl.employeeAddress();
	empl.employeeSalary();
	empl.employeeMobNO();
}
}

