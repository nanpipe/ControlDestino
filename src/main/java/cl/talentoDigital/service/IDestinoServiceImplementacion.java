package cl.talentoDigital.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.talentoDigital.modelo.Destino;
import cl.talentoDigital.repository.IDestinoRepository;

@Service
public class IDestinoServiceImplementacion implements IDestinoService {

	@Autowired
	IDestinoRepository DestinoCRUD;

	@Override
	public void add(Destino destino) {
		DestinoCRUD.save(destino);

	}

	@Override
	public ArrayList<Destino> getListaDestinos() {

		return (ArrayList<Destino>) DestinoCRUD.findAll();
	}
	

}
