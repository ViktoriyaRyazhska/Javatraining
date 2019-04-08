import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IntegerNumbersTEST {

	
	@Test
	void testMax() {
		IntegerNumbers numb = new IntegerNumbers();
		assertEquals(9, numb.max(1, 5, 9));
	}

	@Test
	void testMin() {
		IntegerNumbers numb = new IntegerNumbers();
		assertEquals(1, numb.min(1, 5, 9));
	}

}
