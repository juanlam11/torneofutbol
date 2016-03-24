package mundo;

import java.util.ArrayList;

public class Fase {
	public static final int PUNTOS_GANADOR=3;
	public static final int PUNTOS_PERDEDOR=0;
	public static final int PUNTOS_EMPATE=1;
	private int codigoFase;
	private int numeroGrupos;
	private ArrayList<Grupo> listaEquipos;
	private int tipoFase;
	private String nombreFase;
	private int codigoTorneo;
	private boolean faseCompleta;
	
	/**
	 * Este es el constructor de la clase Fase
	 * @param listaEquipos
	 * @param tipoFase
	 */
	public Fase(ArrayList<String> listaEquipos, int tipoFase) {
		
	}
	

}
