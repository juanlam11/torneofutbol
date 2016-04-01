package mundo;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import image.*;
import db.DBConnection;

import java.sql.*;

public class Equipo implements EventosJuego {
	private int codigoEquipo;
	private String nombreEquipo;
	private String nombreDT;
	private BufferedImage escudo;
	private ArrayList<Jugador> listaJugadores;
	private int golesAnotados;
	private int golesRecibidos;
	private int diferenciaGoles;
	private int numAmarillas;
	private int numRojas;

	public Equipo() {

	}

	public Equipo(int codigoEquipo) {
		cargarEquipo(codigoEquipo);
	}

	public Equipo(int codigoEquipo, String nombreEquipo, String nombreDT, BufferedImage escudo,
			ArrayList<Jugador> listaJugadores) {
		super();
		this.codigoEquipo = codigoEquipo;
		this.nombreEquipo = nombreEquipo;
		this.nombreDT = nombreDT;
		this.escudo = escudo;
		this.listaJugadores = listaJugadores;
	}

	public int getCodigoEquipo() {
		return codigoEquipo;
	}

	public void setCodigoEquipo(int codigoEquipo) {
		this.codigoEquipo=codigoEquipo;
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}
	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}
	public String getNombreDT() {
		return nombreDT;
	}
	public void setNombreDT(String nombreDT) {
		this.nombreDT = nombreDT;
	}
	public BufferedImage getEscudo() {
		return escudo;
	}
	public void setEscudo(BufferedImage escudo) {
		this.escudo = escudo;
	}
	public ArrayList<Jugador> getListaJugadores() {
		return listaJugadores;
	}
	public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
		this.listaJugadores = listaJugadores;
	}
	public int getGolesAnotados() {
		return golesAnotados;
	}
	public void setGolesAnotados(int golesAnotados) {
		this.golesAnotados = golesAnotados;
	}
	public int getGolesRecibidos() {
		return golesRecibidos;
	}
	public void setGolesRecibidos(int golesRecibidos) {
		this.golesRecibidos = golesRecibidos;
	}
	public int getDiferenciaGoles() {
		return diferenciaGoles;
	}
	public void setDiferenciaGoles(int diferenciaGoles) {
		this.diferenciaGoles = diferenciaGoles;
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

	/**
	 * PRECAUCION! :
	 * ESTOS METODOS OPERAN A NIVEL DE LA BASE DE DATOS
	 * recuerde liberar los recursos de la BD con el metodo ResultSet.close()
	 * SE DEBERIA DE PASAR LOS EQUIPOS AL PAQUETE DE LA BASE DE DATOS
	 */

	public void registrarEquipo() {
		//TODO: Falta Implementar

	}

	public void eliminarEquipo() {
		//TODO: Falta implementar
	}

	public void cargarEquipo(int codigoEquipo) {
		//TODO: Falta el arraylist de jugadores 

		try {
			String q="SELECT * FROM Equipo WHERE codigoEquipo="+codigoEquipo;
			Connection conn=DBConnection.connector();
			ResultSet res = null;
			String query=q;
			PreparedStatement pst=conn.prepareStatement(query);
			res = pst.executeQuery();

			while (res.next()) {
				setCodigoEquipo(res.getInt("codigoEquipo"));
				setDiferenciaGoles(res.getInt("diferenciaGoles"));
				setEscudo(Imgconverter.base64StringToImg(res.getString("escudo")));
				setGolesAnotados(res.getInt("golesAnotados"));
				setGolesRecibidos(res.getInt("golesRecibidos"));
				setNombreDT(res.getString("nombreDT"));
				setNombreEquipo(res.getString("nombreEquipo"));
				setNumAmarillas(res.getInt("numAmarillas"));
				setNumRojas(res.getInt("numRojas"));
			}
			pst.close();
			res.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		// A PARTIR DE AQUI VENDRIA LA CARGA DEL ARRAY DE JUGADORES


	}

	public void modificarEquipo() {
		//TODO: Falta implementar
	}
		
	public void recibirGol() {
		//TODO: Falta implementar 
	}
	
	// IMPLEMENTACION
	@Override
	public void roja() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void amarilla() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gol() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void asistencia() {
		// TODO Auto-generated method stub
		
	}
}
