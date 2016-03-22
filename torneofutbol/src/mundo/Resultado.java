package mundo;

import java.util.ArrayList;

public class Resultado {
	
	private int codigoResultado;
	private int codigoPartido;
	private int codigoTorneo;
	private int equipoLocal;
	private int equipoVisitante;
	private int equipoGanador;
	private int equipoPerdedor;
	private int golesLocal;
	private int golesVisitante;
	private int numAmarillasLocal;
	private int numAmarillasVisitante;
	private int numRojasLocal;
	private int numRojasVisitante;
	private int numAsistenciasLocal;
	private int numAsistenciasVisitante;

	/**
	 * Este es el constructor de la clase Resultado
	 * @param codigoResultado
	 * @param codigoPartido
	 * @param codigoTorneo
	 * @param equipoLocal
	 * @param equipoVisitante
	 * @param equipoGanador
	 * @param equipoPerdedor
	 * @param golesLocal
	 * @param golesVisitante
	 * @param numAmarillasLocal
	 * @param numAmarillasVisitante
	 * @param numRojasLocal
	 * @param numRojasVisitante
	 * @param numAsistenciasLocal
	 * @param numAsistenciasVisitante
	 */
	public Resultado(int codigoResultado, int codigoPartido, int codigoTorneo, int equipoLocal, int equipoVisitante,
			int equipoGanador, int equipoPerdedor, int golesLocal, int golesVisitante, int numAmarillasLocal,
			int numAmarillasVisitante, int numRojasLocal, int numRojasVisitante, int numAsistenciasLocal,
			int numAsistenciasVisitante) {
		super();
		this.codigoResultado = codigoResultado;
		this.codigoPartido = codigoPartido;
		this.codigoTorneo = codigoTorneo;
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
		this.equipoGanador = equipoGanador;
		this.equipoPerdedor = equipoPerdedor;
		this.golesLocal = golesLocal;
		this.golesVisitante = golesVisitante;
		this.numAmarillasLocal = numAmarillasLocal;
		this.numAmarillasVisitante = numAmarillasVisitante;
		this.numRojasLocal = numRojasLocal;
		this.numRojasVisitante = numRojasVisitante;
		this.numAsistenciasLocal = numAsistenciasLocal;
		this.numAsistenciasVisitante = numAsistenciasVisitante;
	}

	
	// ACCESORES Y MUTADORES DE LA CLASE //
	
	public int getCodigoResultado() {
		return codigoResultado;
	}

	public int getCodigoPartido() {
		return codigoPartido;
	}

	public int getCodigoTorneo() {
		return codigoTorneo;
	}

	public int getEquipoLocal() {
		return equipoLocal;
	}

	public int getEquipoVisitante() {
		return equipoVisitante;
	}

	public int getEquipoGanador() {
		return equipoGanador;
	}

	public int getEquipoPerdedor() {
		return equipoPerdedor;
	}

	public int getGolesLocal() {
		return golesLocal;
	}

	public int getGolesVisitante() {
		return golesVisitante;
	}

	public int getNumAmarillasLocal() {
		return numAmarillasLocal;
	}

	public int getNumAmarillasVisitante() {
		return numAmarillasVisitante;
	}

	public int getNumRojasLocal() {
		return numRojasLocal;
	}

	public int getNumRojasVisitante() {
		return numRojasVisitante;
	}

	public int getNumAsistenciasLocal() {
		return numAsistenciasLocal;
	}

	public int getNumAsistenciasVisitante() {
		return numAsistenciasVisitante;
	}
	// FIN DE ACCESORES Y MUTADORES DE LA CLASE //
	
	/**
	 * Este metodo registra el resultado en la base de datos 
	 */
	public void registrarResultado() {
		
	}
	/**
	 * Este metodo carga un resultado guardado en la base de datos 
	 * @param codigoResultado
	 */
	public ArrayList<String> mostrarResultado(int codigoResultado) {
		//TODO: El arraylist vacio que hay aca es solo para señalar la salida. Hay que implementarlo
		ArrayList<String> res=new ArrayList<String>();
		return res;
	}
}
