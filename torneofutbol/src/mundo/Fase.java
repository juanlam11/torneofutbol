package mundo;

import java.util.ArrayList;

abstract class Fase {
	private int numEqClasificados;
	private int maxEquiposFase;
	private ArrayList<Equipo> listaEquiposClasificados;
	private ArrayList<Equipo> listaEquiposEnLaFase;
	private int codigoTorneo;
			
	abstract void jugarFase(ArrayList<Equipo> listaEquiposEnLaFase);
	abstract void jugarPartido(Equipo local,Equipo visitante);
	abstract void clasificarEquipo(int codigoEquipo);
	
	
	public int getNumEqClasificados() {
		return numEqClasificados;
	}
	public int getMaxEquiposFase() {
		return maxEquiposFase;
	}
	public ArrayList<Equipo> getListaEquiposClasificados() {
		return listaEquiposClasificados;
	}
	public int getCodigoTorneo() {
		return codigoTorneo;
	}
	public ArrayList<Equipo> getListaEquiposEnLaFase() {
		return listaEquiposEnLaFase;
	}	
}
