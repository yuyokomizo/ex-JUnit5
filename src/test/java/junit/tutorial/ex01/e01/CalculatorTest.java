package junit.tutorial.ex01.e01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import junit.tutorial.ex01.e02.Calculator;

class CalculatorTest {

	@Test
	@DisplayName("第二引数に0を挿入")
	public void test1() {
			try {
				Calculator calculator = new Calculator();
				calculator.divide(2, 0);
				fail();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("例外処理の成功");
		}
		}
	}

