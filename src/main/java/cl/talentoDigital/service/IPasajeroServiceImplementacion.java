package cl.talentoDigital.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import cl.talentoDigital.modelo.Pasajero;
import cl.talentoDigital.repository.IPasajeroRepository;



@Service
public class IPasajeroServiceImplementacion implements IPasajeroService {

	@Autowired
	IPasajeroRepository PasajeroCRUD;
	
	
	@Override
	public void add(Pasajero pasajero) {
		PasajeroCRUD.save(pasajero);

	}

	@Override
	public ArrayList<Pasajero> getListaPasajeros() {
		
		return (ArrayList<Pasajero>) PasajeroCRUD.findAll();
	}

}

