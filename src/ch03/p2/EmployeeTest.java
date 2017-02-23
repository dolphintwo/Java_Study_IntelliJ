package ch03.p2;
import ch03.p1.*;

public class EmployeeTest {
	public static void main(String args[]){
		Employee empone = new Employee("DolphinOne");
		Employee emptwo = new Employee("DolphinTwo");
		
		empone.empAge(26);
		empone.empDesignation("SSE");
		empone.empSalary(1000);
		empone.printEmployee();
		
		emptwo.empAge(22);
		emptwo.empDesignation("JSE");
		emptwo.empSalary(500);
		emptwo.printEmployee();
	}
}
