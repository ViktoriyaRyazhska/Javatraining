import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FloatNumbMethodTEST {


	@Test
	void testGetRange() {
		FloatNumbMethod floatNum = new FloatNumbMethod();
	assertEquals(true, floatNum.getRange(1));
	assertEquals(false, floatNum.getRange(7));
	}

}
