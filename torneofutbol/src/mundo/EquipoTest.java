package mundo;

import static org.junit.Assert.*;

import org.junit.Test;

public class EquipoTest {

	@Test
	public void testCargarEquipo() {
		Equipo eq = new Equipo();
		eq.cargarEquipo(1);
	}

}
