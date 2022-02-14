package junit.tutorial.ex02.e02;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EmployeeTest {
	
	@Test
	@DisplayName("テキストファイルの読み込み後、リストの内容表示を実行")
	void test() {
	try {
		Employee employee = new Employee();
		List<Employee> list = new ArrayList<>();
		
		InputStream input = new FileInputStream("C:\\env\\springworkspace\\Junit-practice-1\\src\\main\\java\\junit\\tutorial\\ex02\\e02\\Employee.txt");
		list = employee.load(input);
		Employee employee1 = list.get(0);
		
		assertEquals("Ichiro", employee1.getFirstName(), "FirstNameの表示");
		assertEquals("Tanaka", employee1.getLastName(), "LastNameの表示");
		assertEquals("ichiro@example.com", employee1.getEmail(), "Emailの表示");	
		
	} catch (Exception e) {
		
		throw new RuntimeException(e);
		// TODO: handle exception
		}
	}
}
