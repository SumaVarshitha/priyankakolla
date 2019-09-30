import static org.junit.Assert.*;

import org.junit.Test;


public class reverseTest {

	@Test
	public void test() {
		reverse r=new reverse();
		int d=r.reverse(105);
		assertEquals(501,d);
	}

}
