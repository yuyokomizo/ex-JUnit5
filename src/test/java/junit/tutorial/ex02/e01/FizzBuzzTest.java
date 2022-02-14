package junit.tutorial.ex02.e01;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	@Test
	@DisplayName("１６を指定してcreateFizzBuzzListメソッドを実行")
	void test() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		assertIterableEquals("1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz,16",fizzbuzz.createFizzBuzzList(16));
	}

	private void assertIterableEquals(String string, List<String> createFizzBuzzList) {
		// TODO Auto-generated method stub
		
	}

}
