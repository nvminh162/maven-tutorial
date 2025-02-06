import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.MayTinh;

class TestMayTinh {

	@Test
	void testPhepCong() {
		assertEquals(15, MayTinh.cong(10, 5), 0.01);
	}
	
	@Test
	void testPhepTru() {
		assertEquals(5, MayTinh.tru(10, 5), 0.01);
	}
	
//	test -Dtest='TestMayTinh'
//	test -Dtest='TestMayTinh'#testPhepCong

}
