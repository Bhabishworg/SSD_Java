package week5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ProductTest {
	@Test							// annotation indicates this is a test method to be run
	void inStockTest() {
		Product product = new Product(100, 5.26f);
		assertTrue(product.inStock());
	}
	
	@Test
	void outOfStockTest() {
		Product product = new Product(0, 5.26f);
		assertFalse(product.inStock());
	}
	 
	@Test
	void stockValueTest() {
		Product product = new Product(100, 5.26f);
		assertEquals(526, product.getStockValue());
	}
}
