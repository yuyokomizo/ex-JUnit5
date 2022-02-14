package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ItemStockTest {
	
	ItemStock itemstock = new ItemStock();

	@Test
	@DisplayName("初期状態で、getNumメソッドを実行")
	public void test1() {
		Item book = new Item("book", 500);
		assertEquals(0, itemstock.getNum(book),"getNumメソッドを実行すると0が取得できる");
	}

	
	@Test
	@DisplayName("初期状態で、addでItemを追加した後getNumメソッドを実行")
	public void test2() {
		Item item = new Item("book", 500);
		itemstock.add(item);
		assertEquals(1, itemstock.getNum(item),"addメソッド1回実行後getNumメソッドを実行すると1が取得できる");
	}
	
	@Test
	@DisplayName("addでItemオブジェクトを2回追加後getNumメソッドを実行")
	public void test3() {
		Item item = new Item("book", 500);
		itemstock.add(item);
		itemstock.add(item);
		assertEquals(2, itemstock.getNum(item),"addメソッド2回実行後getNumメソッドを実行すると2が取得できる");
	}
	
	@Test
	@DisplayName("addで異なる2つのItemオブジェクトを追加後getNumメソッドを実行")
	public void test4() {
		Item item = new Item("book", 500);
		Item item2 = new Item("CD", 500);
		itemstock.add(item);
		itemstock.add(item2);
		assertEquals(1, itemstock.getNum(item),"addで異なる2つのItemオブジェクトを追加後getNumメソッドを実行すると1が取得できる");
	}
}
