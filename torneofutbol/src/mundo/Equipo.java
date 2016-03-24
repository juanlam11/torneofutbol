package mundo;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Equipo {
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
	
	public void registrarEquipo() {
		//TODO: Falta Implementar
	}
	
	public void eliminarEquipo() {
		//TODO: Falta implementar
	}
}
