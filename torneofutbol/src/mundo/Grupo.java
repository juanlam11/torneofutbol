package mundo;

import java.util.ArrayList;

public class Grupo {
	
	private String nombreGrupo;
	private Equipo equipoA;
	private Equipo equipoB;
	private Equipo equipoC;
	private Equipo equipoD;
	private int codigoTorneo;
	private int codigoGrupo;
	private ArrayList<String> clasificadosTodosContraTodos;
	
	/**
	 * Constructor de la clase Grupo
	 * @param nombreGrupo
	 * @param equipoA
	 * @param equipoB
	 * @param equipoC
	 * @param equipoD
	 * @param codigoTorneo
	 */
	public Grupo(String nombreGrupo, Equipo equipoA, Equipo equipoB, Equipo equipoC, Equipo equipoD, int codigoTorneo) {
		super();
		this.nombreGrupo = nombreGrupo;
		this.equipoA = equipoA;
		this.equipoB = equipoB;
		this.equipoC = equipoC;
		this.equipoD = equipoD;
		this.codigoTorneo = codigoTorneo;
	}
	
	public String getNombreGrupo() {
		return "";
	}
	
	/**
	 * Este metodo debe jugar el todos contra todos y sacar dos clasificados
	 * @return res
	 */
	public ArrayList<String> jugarTodosContraTodos() {
		ArrayList res = new ArrayList<String>();
		return res;
	}

}
