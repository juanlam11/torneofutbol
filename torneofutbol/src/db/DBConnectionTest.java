package db;

import static org.junit.Assert.*;

import org.junit.Test;

public class DBConnectionTest {

	@Test
	public void testDBConnection() {
		try {
		DBConnection conn = new DBConnection();
		}
		catch (Exception e) {
			fail("Base de datos no conectó");
		}
		
	}

}
