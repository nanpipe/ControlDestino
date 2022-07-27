package cl.talentoDigital.service;

import java.util.ArrayList;

import cl.talentoDigital.modelo.Pasajero;

public interface IPasajeroService {
	
	
	public void add(Pasajero pasajero);
	public ArrayList<Pasajero> getListaPasajeros();
	
}
