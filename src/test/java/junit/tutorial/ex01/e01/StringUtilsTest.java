package junit.tutorial.ex01.e01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

	@Test
	@DisplayName("引数にaaaを挿入")
	void test1() {
		String result1 = StringUtils.toSnakeCase("aaa");
		assertEquals("aaa",result1,"StringUtils.toSnakeCaseの引数がaaaの場合");
	}
	
	@Test
	@DisplayName("引数にHelloWorldを挿入")
	void test2() {
		String result2 = StringUtils.toSnakeCase("HelloWorld");
		assertEquals("hello_world",result2,"StringUtils.toSnakeCaseの引数がHelloWorldの場合");
	}
	
	@Test
	@DisplayName("引数にpracticeJunitを挿入")
	void test3() {
		String result3 = StringUtils.toSnakeCase("practiceJunit");
		assertEquals("practice_junit",result3,"StringUtils.toSnakeCaseの引数がpracticeJunitの場合");
	}
}