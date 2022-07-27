package cl.talentoDigital.service;

import java.util.ArrayList;

import cl.talentoDigital.modelo.Destino;

public interface IDestinoService {
	
	public void add(Destino destino);
	public ArrayList<Destino> getListaDestinos();
	
}
