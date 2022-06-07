package it.prova.catenadimontaggio.service;

import org.springframework.stereotype.Service;

import it.prova.catenadimontaggio.model.Automobile;

@Service
public class CarrozzeriaServiceImpl implements CarrozzeriaService{

	@Override
	public void aggiuntaCarrozzeria(Automobile automobileInput) {
		// TODO Auto-generated method stub
		System.out.println("Carrozzeria aggiunta a "+ automobileInput);
	}
	
}
