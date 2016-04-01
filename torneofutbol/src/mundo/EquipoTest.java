package mundo;

import static org.junit.Assert.*;

import org.junit.Test;

public class EquipoTest {

	@Test
	public void testCargarEquipo() {
		Equipo eq = new Equipo();
		try {
		eq.cargarEquipo(1);
		assertEquals(eq.getCodigoEquipo(),1);
		assertEquals(eq.getNombreEquipo(),"Admira wacker");
		}
		catch (Exception e) {
			e.getMessage();
			fail("Se jodio esta vaina");
		}
	}

}
