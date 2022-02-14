package junit.tutorial.ex01.e01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import junit.tutorial.ex01.e03.Counter;

class CounterTest {

	private Counter counter = new Counter();
	
	@Test
	@DisplayName("初期状態でincrementメソッド実行")
	public void test1() {
		assertEquals(1, counter.increment(),"incrementメソッドを実行すると１が取得できる");
	}
	
	@Test
	@DisplayName("初期状態でincrementメソッドを2回実行")
	public void test2() {
		assertEquals(2, counter.increment(),"・incrementメソッドを１回実行した状態で、incrementメソッドを実行すると２が取得できる");
	}
	
	@Test
	@DisplayName("初期状態でincrementメソッドを50回実行した後もう一度実行")
	public void test3() {
		
		Counter counter2 = new Counter();

		for(int i=0;i<50;i++) {
			counter2.increment();
		}
		assertEquals(51, counter2.increment(),"incrementメソッドを50回実行した状態で、incrementメソッドを実行すると５１が取得できる");
	}

}
