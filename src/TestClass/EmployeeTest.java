package TestClass;


import java.io.*;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee empone=new Employee("RUNOOB1");
		Employee emptwo=new Employee("RUNOOB2");
		
//	������������Ա����ķ���
		empone.empAge(26);
		empone.empDesignation("�߼�����Ա");
		empone.empSalary(1000);
		empone.printEmployee();
		
		emptwo.empAge(21);
		emptwo.empDesignation("��������Ա");
		emptwo.empSalary(500);
		emptwo.printEmployee();
		
	}


}
