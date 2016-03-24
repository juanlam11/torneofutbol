package mundo;

import java.util.ArrayList;

public class Torneo {

	private int numEquiposParticipantes;
	private static int codigoTorneo;
	private String nombreTorneo;
	private ArrayList<Equipo> listaEquipos;
	
	/**
	 * Constructor de la clase Torneo
	 * @param nombre
	 * @param numEquipos
	 */
	
	public Torneo(String nombre, int numEquipos, ArrayList<Equipo> listaEquipos) {
		//TODO: Falta Implementar
	}
	
	// ACCESORES Y MUTADORES DE LA CLASE //
	
	public int getNumEquiposParticipantes() {
		return numEquiposParticipantes;
	}

	public void setNumEquiposParticipantes(int numEquiposParticipantes) {
		//TODO: Los equipos son multiplos de 4, ojo con eso
		this.numEquiposParticipantes = numEquiposParticipantes;
	}

	public int getCodigoTorneo() {
		return codigoTorneo;
	}

	public String getNombreTorneo() {
		return nombreTorneo;
	}

	public void setNombreTorneo(String nombreTorneo) {
		this.nombreTorneo = nombreTorneo;
	}

	public ArrayList<Equipo> getListaEquipos() {
		return listaEquipos;
	}
	
	// FIN DE ACCESORES Y MUTADORES DE LA CLASE //
	
	public void iniciarTorneo(int codigoTorneo) {
		//TODO: Falta Implementar
	}
	
	public String crearInformeTorneo(int codigoTorneo) {
		//TODO: Falta Implementar
		return "";
	}
	
	public void agregarEquipo(int codigoEquipo) {
		//TODO: Falta Implementar
	}

	public void eliminarEquipo(int codigoEquipo) {
		//TODO: Falta Implementar
	}
	
	public void registrarTorneo() {
		//TODO: Falta Implementar
	}
	
	public void eliminarTorneo() {
		//TODO: Falta Implementar
	}
}
