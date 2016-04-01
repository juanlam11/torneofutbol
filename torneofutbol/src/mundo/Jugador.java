package mundo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import db.DBConnection;

public class Jugador {
	
	private int codigoJugador;
	private String nombreJugador;
	private int numJugador;
	private int golesAnotados;
	private int numAsistencias;
	private int numAmarillas;
	private int numRojas;
	
	/**
	 * Esta clase tiene dos constructores en sobrecarga, este es para abrir un jugador e ir llenando
	 * los datos
	 * @param nombreJugador
	 * @param numJugador
	 */
	public Jugador(String nombreJugador, int numJugador) {
		this.nombreJugador = nombreJugador;
		this.numJugador = numJugador;
	}
	/**
	 * Esta clase tiene dos constructores en sobrecarga, este es para cuando se tiene informacion acumulada
	 * y se desea partir de ahi y empezar a llenar
	 * @param codigoJugador
	 * @param nombreJugador
	 * @param numJugador
	 * @param golesAnotados
	 * @param numAsistencias
	 * @param numAmarillas
	 * @param numRojas
	 */
	public Jugador(int codigoJugador, String nombreJugador, int numJugador, int golesAnotados, int numAsistencias,
			int numAmarillas, int numRojas) {
		super();
		this.codigoJugador = codigoJugador;
		this.nombreJugador = nombreJugador;
		this.numJugador = numJugador;
		this.golesAnotados = golesAnotados;
		this.numAsistencias = numAsistencias;
		this.numAmarillas = numAmarillas;
		this.numRojas = numRojas;
	}
	
	// ACCESORES Y MUTADORES DE LA CLASE //
	public String getNombreJugador() {
		return nombreJugador;
	}

	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}

	public int getNumJugador() {
		return numJugador;
	}

	public void setNumJugador(int numJugador) {
		this.numJugador = numJugador;
	}

	public int getGolesAnotados() {
		return golesAnotados;
	}

	public void setGolesAnotados(int golesAnotados) {
		this.golesAnotados = golesAnotados;
	}

	public int getNumAsistencias() {
		return numAsistencias;
	}

	public void setNumAsistencias(int numAsistencias) {
		this.numAsistencias = numAsistencias;
	}

	public int getNumAmarillas() {
		return numAmarillas;
	}

	public void setNumAmarillas(int numAmarillas) {
		this.numAmarillas = numAmarillas;
	}

	public int getNumRojas() {
		return numRojas;
	}

	public void setNumRojas(int numRojas) {
		this.numRojas = numRojas;
	}

	public int getCodigoJugador() {
		return codigoJugador;
	}
	
	public void setCodigoJugador(int codigoJugador) {
		this.codigoJugador=codigoJugador;
	}
	// FIN DE ACCESORES Y MUTADORES DE LA CLASE //	
	
	/**
	 * Este metodo devuelve toda la info del jugador en forma de Array
	 * @return res
	 */
	public ArrayList<String> infoJugador() {
		//TODO: Falta Implementar
		ArrayList<String> res = new ArrayList<String>();
		return res;
	}
	
	/**
	 * Este metodo es para registar un jugador en la base de datos 
	 */
	public void registrarJugador() {
		//TODO: Falta Implementar
	}
	
	/**
	 * Este metodo es para borrar un jugador de la base de datos
	 * @param codigoJugador
	 */
	public void eliminarJugador(int codigoJugador) {
		//TODO: Falta Implementar
	}

	public void cargarJugador(int codigoJugador) {
		//TODO: Falta Implementar
		try {
			String q="SELECT * FROM Jugador WHERE codigoJugador="+codigoJugador;
			Connection conn=DBConnection.connector();
			ResultSet res = null;
			String query=q;
			PreparedStatement pst=conn.prepareStatement(query);
			res = pst.executeQuery();
			
			while(res.next()) {
				setCodigoJugador(res.getInt("codigoJugador"));
				setNombreJugador(res.getString("nombreJugador"));
				setNumJugador(res.getInt("numJugador"));
				setGolesAnotados(res.getInt("golesAnotados"));
				setNumAsistencias(res.getInt("numAsistencias"));
				setNumAmarillas(res.getInt("numAmarillas"));
				setNumRojas(res.getInt("numRojas"));
			}
			pst.close();
			res.close();
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
