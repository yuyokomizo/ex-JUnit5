package junit.tutorial.ex02.e01;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	@Test
	@DisplayName("１６を指定してcreateFizzBuzzListメソッドを実行")
	void test() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("Fizz");
		list.add("4");
		list.add("Buzz");
		list.add("Fizz");
		list.add("7");
		list.add("8");
		list.add("Fizz");
		list.add("Buzz");
		list.add("11");
		list.add("Fizz");
		list.add("13");
		list.add("14");
		list.add("FizzBuzz");
		list.add("16");
		assertIterableEquals("1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz,16",fizzbuzz.createFizzBuzzList(16));
	}

	private void assertIterableEquals(String string, List<String> createFizzBuzzList) {
		// TODO Auto-generated method stub
		
	}

}
