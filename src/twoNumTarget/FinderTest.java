package twoNumTarget;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FinderTest {
	Finder find = new Finder();
	int a[] = {5, 3, 4, 7, 1};
	int b[] = {9, 3, 8, 1, 4, 1, 7};
	int c[] = {4, 5, 6};
	int x = 10;
	int y = 8;
	int z = 22;

	@Test
	void test1() {
		Boolean output = find.search(a, x);
		assertEquals(true ,output);
	}
	@Test
	void test2() {
		Boolean output = find.search(b, x);
		assertEquals(true ,output);
	}
	@Test
	void test3() {
		Boolean output = find.search(c, x);
		assertEquals(true ,output);
	}
	@Test
	void test4() {
		Boolean output = find.search(a, y);
		assertEquals(true ,output);
	}
	@Test
	void test5() {
		Boolean output = find.search(b, y);
		assertEquals(true ,output);
	}
	@Test
	void test6() {
		Boolean output = find.search(c, y);
		assertEquals(false ,output);
	}
	@Test
	void test7() {
		Boolean output = find.search(a, z);
		assertEquals(false ,output);
	}
	@Test
	void test8() {
		Boolean output = find.search(b, z);
		assertEquals(false ,output);
	}
	@Test
	void test9() {
		Boolean output = find.search(c, z);
		assertEquals(false ,output);
	}

}
