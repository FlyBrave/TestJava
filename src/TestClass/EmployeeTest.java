package TestClass;


import java.io.*;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee empone=new Employee("RUNOOB1");
		Employee emptwo=new Employee("RUNOOB2");
		
//	调用这两个成员对象的方法
		empone.empAge(26);
		empone.empDesignation("高级程序员");
		empone.empSalary(1000);
		empone.printEmployee();
		
		emptwo.empAge(21);
		emptwo.empDesignation("初级程序员");
		emptwo.empSalary(500);
		emptwo.printEmployee();
		
	}


}
