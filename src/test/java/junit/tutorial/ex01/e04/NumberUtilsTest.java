package junit.tutorial.ex01.e04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NumberUtilsTest {

	@Test
	@DisplayName("引数が偶数である場合trueを返すメソッド実行")
	public void test1() {
		assertTrue(NumberUtils.isEven(10),"isEvenメソッドの引数が10の場合");
	}

	@Test
	@DisplayName("引数が偶数である場合trueを返すメソッド実行")
	public void test2() {
		assertFalse(NumberUtils.isEven(7),"isEvenメソッドの引数が7の場合");
	}
}
